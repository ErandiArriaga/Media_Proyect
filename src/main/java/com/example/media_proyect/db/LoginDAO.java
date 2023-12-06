package com.example.media_proyect.db;

import com.example.media_proyect.models.Login;
import com.example.media_proyect.models.Usuarios;

import javax.xml.transform.Result;
import java.sql.*;

public class LoginDAO {
    private Connection conn;

    public LoginDAO(){
    }

    public Login login(String correo) throws SQLException {
        Login login = null;
        conn = MySQLConnection.getConnection();
        String consulta = "select u.correo as correo, u.contrasenia as contraseña, tp.nombre as tipo from usuarios u join tipo_usuario tp on u.id_tipo_usuario=tp.id where correo=?";
        try{
            assert conn != null;
            try (PreparedStatement statement = conn.prepareStatement(consulta)) {
                statement.setString(1, correo);
                ResultSet rs = statement.executeQuery();
                while(rs.next()) {
                    login = new Login(rs.getString("correo"), rs.getString("contraseña"), rs.getString("tipo"));
                }
                System.out.println(login.getEmail());
                System.out.println(login.getMembresia());
                return login;
            }
        } catch (SQLException sqlException)
        {
            System.out.println(sqlException.getMessage());
        }
        return login;
    }
}
