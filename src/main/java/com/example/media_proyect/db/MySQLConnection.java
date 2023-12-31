package com.example.media_proyect.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.example.media_proyect.*;
public class MySQLConnection {

    private static Connection conn = null;
    private static String hostname   = "localhost";
    private static String dbname = "mediaplayer";
    private static String dbport = "3306";
    private static String dbuser = "admin";
    private static String dbpass = "mysecret";


    public static void Connect() {
        try {
            //Class.forName("mysql-connector-java-8.0.30");
            conn =
                    DriverManager.getConnection("jdbc:mysql://"+hostname+"/"+dbname+"?user="+dbuser+"&password="+dbpass);
            System.out.println("Successful database connection.");
        } //catch (ClassNotFoundException ex) {
            //Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        //}
        catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection()
    {
        if(conn == null) Connect();
        return conn;
    }

    public static void Disconnect() {
        try {
            conn.close();
            System.out.println("Database connection has been terminated.");
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
