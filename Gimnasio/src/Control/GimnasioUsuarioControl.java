/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Conexion.conexion;
import Gimnasio.taller;
import Gimnasio.tallerExtra;
import gui.GimnasioUsuario;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author arjoz
 */
public class GimnasioUsuarioControl {
     GimnasioUsuario vista;
    tallerExtra tallerExtr = new tallerExtra();
    DefaultTableModel modelotabla = new DefaultTableModel();

    public GimnasioUsuarioControl(GimnasioUsuario vista) {
        this.vista = vista;
        vista.setVisible(true);
        listarTabla();
        Timer timer = new Timer(5000, (e) -> actualizarTabla());
        timer.start();
    }

    public void listarTabla() {
        String[] titulos = {"ID", "Clase", "Instructor", "Horario", "Duracion", "Zona", "Nivel", "Descripcion"};
        modelotabla = new DefaultTableModel(titulos, 0);
        List<taller> listaTalleres = tallerExtr.ListarTalleres();

        for (taller tall : listaTalleres) {
            modelotabla.addRow(new Object[]{tall.getIdClase(), tall.getNombreTaller(), tall.getNombreInstructor(), tall.getHorarioTaller(), tall.getDuracion(), tall.getZona(), tall.getNivel(), tall.getDescripcion()});
        }

        vista.getTablaTaller().setModel(modelotabla);
    }
    
    public void actualizarTabla() {
    modelotabla.setRowCount(0); // Limpiar la tabla
    listarTabla(); // Volver a cargar los datos actualizados
}

}

