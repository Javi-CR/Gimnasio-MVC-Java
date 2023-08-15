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

    Connection con;
    String driver = "com.mysql.cj.jdbc.Driver";
    String bdName = "Gimnasio";
    String url =  "jdbc:mysql://localhost:3306/"+bdName+"?useSSL=false&serverTimezone=UTC";
    String usuario = "root";
    String clave ="Arvas1881802";
    
    public Connection conectarBaseDatos(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error en la conexion: "+ e);
        }
        return con;

}
    
      public void desconectar() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Desconexión exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error al desconectar: " + e);
        }
    }
}
