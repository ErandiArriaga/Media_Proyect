package com.example.media_proyect.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    private Connection conn;

    public LoginDAO(Connection conn){
        this.conn=conn;
    }

    public String getUser(String name, String password){
        try{
            String query = "select usuarios " +
                    "from tipoUsuario " +
                    "where tipo in (select tipo " +
                    "from usuario " +
                    "where nombre=\""+name+"\" and password=\""+password+"\")";
           Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
                return rs.getString("usuarios");
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return "";
    }
}
