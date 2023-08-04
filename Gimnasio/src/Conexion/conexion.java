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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arjoz
 */
public class conexion {

    Connection conexion = null;

    String url = "jdbc:mysql://localhost:3306/gimnasio";
    String username = "root";
    String password = "84684089";
    String driver = "com.mysql.cj.jdbc.Driver";

    public Connection conectar() {

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado");
        } catch (SQLException error) {
            error.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
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
