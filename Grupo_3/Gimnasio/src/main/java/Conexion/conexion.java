/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author arjoz
 */
public class conexion {

    Connection conexion = null;

    String url = "jdbc:mysql://localhost:3306/gimnasio";
    String username = "root";
    String password = "84684089";

    public Connection conectar() {

        try {
            conexion = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado");
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return conexion;

    }

    public void desconectar() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Desconectado");
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
    }

}
