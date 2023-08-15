/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gimnasio;

import Conexion.conexion;
import gui.GimnasioInstructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arjoz
 */
public class tallerExtra {
    conexion conectar = new conexion();
    Connection con;
    PreparedStatement ps;

    ResultSet rs;
    GimnasioInstructor vista = new GimnasioInstructor();
    DefaultTableModel modeloTabala = new DefaultTableModel();



    public List<taller> ListarTalleres() {
        String sql = "SELECT * FROM Taller";
        List<taller> lista = new ArrayList<>();

        try {
            con = conectar.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                taller tall = new taller();
                tall.setIdClase(rs.getInt("idclase"));
                tall.setNombreTaller(rs.getString("nombreTaller"));
                tall.setNombreInstructor(rs.getString("nombreInstructor"));
                tall.setHorarioTaller(rs.getString("horarioTaller"));
                tall.setDuracion(rs.getString("duracion"));
                tall.setZona(rs.getString("zona"));
                tall.setNivel(rs.getString("nivel"));
                tall.setDescripcion(rs.getString("descripcion"));

                lista.add(tall); // Agregar el objeto a la lista
            }

            // Cerrar conexiones después del bucle
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e);
        }

        return lista;
    }



    public void agregar(taller tall) {
        String sql = "INSERT INTO Taller (nombreTaller, nombreInstructor, horarioTaller, duracion, zona, nivel, descripcion)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            con = conectar.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, tall.getNombreTaller());
            ps.setString(2, tall.getNombreInstructor());
            ps.setString(3, tall.getHorarioTaller());
            ps.setString(4, tall.getDuracion());
            ps.setString(5, tall.getZona());
            ps.setString(6, tall.getNivel());
            ps.setString(7, tall.getDescripcion());
            ps.executeUpdate();
            ps.close();
       


        } catch (SQLException e) {
            
            System.out.println("Error en agregar: "+ e);
        }
        
        
        
        
    }
    
    public void actualizar(taller taller){
    String sql = "update Taller set nombreTaller = ? , nombreInstructor = ?,horarioTaller = ?, duracion = ?, zona = ?, nivel = ?, descripcion = ? where idclase = ?";
        try {
            con = conectar.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, taller.getNombreTaller());
            ps.setString(2, taller.getNombreInstructor());
            ps.setString(3, taller.getHorarioTaller());
            ps.setString(4, taller.getDuracion());
            ps.setString(5, taller.getZona());
            ps.setString(6, taller.getNivel());
            ps.setString(7, taller.getDescripcion());
            ps.setInt(8, taller.getIdClase());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
             System.out.println("Error en actualizar" + e);
        }
    
    }
    public void borrar (int id){
    String sql = "delete from Taller where idclase =" +id;
        try {
            con = conectar.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            
             System.out.println("Error en borrar dao:"+ e);
        }
    }
    
}
