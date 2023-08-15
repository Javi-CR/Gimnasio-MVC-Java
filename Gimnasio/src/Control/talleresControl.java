/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.conexion;
import Gimnasio.taller;
import Gimnasio.tallerExtra;
import gui.GimnasioInstructor;
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

/**
 *
 * @author arjoz
 */
public class talleresControl implements ActionListener {

     taller tall = new taller();
    tallerExtra tallEx = new tallerExtra();
    GimnasioInstructor vista  = new GimnasioInstructor();
    DefaultTableModel modelotabla = new DefaultTableModel();
    // variables
    private int id = 0;
    private String nombreTaller;
    private String nombreInstructor;
    private String horarioTaller;
    private String duracion;
    private String zona;
    private String nivel;
    private String descripcion;
    
public talleresControl(GimnasioInstructor vista) {
    this.vista = vista;
    vista.setVisible(true);
    agregarEventos();
    listarTabla();
}
    public void agregarEventos(){
    vista.getBtonCrearTaller().addActionListener(this);
    vista.getBtonActTABLA().addActionListener(this);
    vista.getBtonBorrarTaller().addActionListener(this);
    vista.getTablaTaller().addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
        llenarCampos(e);
    }
    });
    
    }
    
        public void listarTabla() {
        String[] titulos = {"ID", "Clase", "Instructor", "Horario", "Duracion", "Zona", "Nivel", "Descripcion"};
        modelotabla = new DefaultTableModel(titulos, 0);
        List<taller> listaTalleres = tallEx.ListarTalleres();

        for (taller tall : listaTalleres) {
            modelotabla.addRow(new Object[]{tall.getIdClase(), tall.getNombreTaller(), tall.getNombreInstructor(), tall.getHorarioTaller(), tall.getDuracion(), tall.getZona(), tall.getNivel(), tall.getDescripcion()});
        }

        vista.getTablaTaller().setModel(modelotabla);
    }
        public boolean ValidarDatos(){
        if("".equals(vista.getTallerNom().getText())|| "".equals(vista.getInstructorNom().getText())|| 
                "".equals(vista.getHoraTaller().getText())|| "".equals(vista.getDuracionTaller().getText())|| "".equals(vista.getZonaTaller().getText())|| 
                "".equals(vista.getNivelTaller().getText())|| "".equals(vista.getDescripcionTaller().getText())){
            JOptionPane.showMessageDialog(null, "Los campos no pueden ser vacios", "Error", JOptionPane.ERROR); 
            return false;
        }
        return true;
        }
        
        private void llenarCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
         id = (int) vista.getTablaTaller().getModel().getValueAt(target.getSelectedRow(), 0);
         vista.getTallerNom().setText(vista.getTablaTaller().getModel().getValueAt(target.getSelectedRow(), 1).toString());
         vista.getInstructorNom().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 2).toString());
         vista.getHoraTaller().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 3).toString());
         vista.getDuracionTaller().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 4).toString());
         vista.getZonaTaller().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 5).toString());
         vista.getNivelTaller().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 6).toString());
         vista.getDescripcionTaller().setText(vista.TablaTaller.getModel().getValueAt(target.getSelectedRow(), 7).toString());
        }
        
        private boolean CargarDatos(){
            try {
                nombreTaller = vista.getTallerNom().getText();
                nombreInstructor = vista.getInstructorNom().getText();
                horarioTaller = vista.getHoraTaller().getText();
                duracion = vista.getDuracionTaller().getText();
                zona = vista.getZonaTaller().getText();
                nivel = vista.getNivelTaller().getText();
                descripcion = vista.getDescripcionTaller().getText();
                return true;
                
            } catch (Exception e) {
                 System.out.println("Error al cargar datos" + e);
                 return false;
            }
          
        }
            private void limpiar(){
            vista.getTallerNom().setText("");
            vista.getInstructorNom().setText("");
            vista.getHoraTaller().setText("");
            vista.getDuracionTaller().setText("");
            vista.getZonaTaller().setText("");
            vista.getNivelTaller().setText("");
            vista.getDescripcionTaller().setText("");
            id = 0;
            nombreTaller = "";
            nombreInstructor = "";
            horarioTaller = "";
            duracion = "";
            zona = "";
            nivel = "";
            descripcion = "";
            
            }

        
         private void AgregarTaller(){
             try {
                 if (ValidarDatos()) {
                     if (CargarDatos()) {
                         taller tall = new taller(nombreTaller, nombreInstructor, horarioTaller, zona, nivel, descripcion, duracion);
                         tallEx.agregar(tall);
                         JOptionPane.showMessageDialog(null, "Registro exitoso");
                         limpiar();
                     }
                     
                 }
             } catch (HeadlessException e) {
                 JOptionPane.showMessageDialog(null, "El taller ya existe", "Error", JOptionPane.ERROR);
                 System.out.println("Error en agregarC" + e);
             }finally{
             listarTabla();
             }
        }
         private void actualizarTaller(){
             try {
                 if (ValidarDatos()) {
                     if (CargarDatos()) {
                         taller talle = new taller(id, nombreTaller, nombreInstructor, horarioTaller, zona, nivel, descripcion, duracion);
                         tallEx.actualizar(talle);
                         JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
                         limpiar();
                     }
                     
                 }
             } catch (HeadlessException e) {
                  JOptionPane.showMessageDialog(null, "Debe seleccionar un taller de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
                  System.out.println("Error en actualizarC" + e);
                  
             }finally{
             listarTabla();
             }
         }
         
private void borrarTaller() {
    try {
        if (id != 0) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de borrar este taller?", "Confirmación de borrado", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                tallEx.borrar(id);
                JOptionPane.showMessageDialog(null, "Registro borrado");
                listarTabla();
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un taller de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (HeadlessException e) {
        System.out.println("Error en borrarC: " + e);
    }
}
        
         @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource() == vista.getBtonCrearTaller()){
      AgregarTaller();
      }
      if(ae.getSource() == vista.getBtonActTABLA()){
      actualizarTaller();
      }
      if(ae.getSource() == vista.getBtonBorrarTaller()){
      borrarTaller();
      }
      }
      
      
        
      
        

    }


