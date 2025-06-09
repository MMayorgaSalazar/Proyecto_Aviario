package Consultas_modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion_bd {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/aviario?serverTime=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}

