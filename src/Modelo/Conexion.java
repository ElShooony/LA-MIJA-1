package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://127.0.0.1:3306/proyint?serverTimezone=America/Mexico_City";
            con = DriverManager.getConnection(myBD, "root", "12qw34as5z");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}