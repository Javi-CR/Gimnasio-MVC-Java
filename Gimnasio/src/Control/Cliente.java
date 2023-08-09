/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Gimnasio.usuarios;
import gui.PantallaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Cliente extends usuarios {
    Random random = new Random();
    Conexion.conexion con = new Conexion.conexion();
    public Cliente(String Nombre, String Edad, String Direccion, String telefono, int Cedula, int ID, String Correo, String Contraseña) {
        super(Nombre, Edad, Direccion, telefono, Cedula, ID, Correo, Contraseña);
    }
    
    
    @Override
    public void Registrar() {
        setNombre(JOptionPane.showInputDialog(
                "Ingrese su nombre completo: "));
        setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cédula")));
        
        setEdad(JOptionPane.showInputDialog(
                "Ingrese su edad: "));
        setTelefono(JOptionPane.showInputDialog("Ingrese su telefono: "));
        
        setID(1342);
        
        setCorreo(JOptionPane.showInputDialog("Ingrese su correo electronico: "));
        
        setContraseña(JOptionPane.showInputDialog("Ingrese su contraseña: "));
        
        System.out.println("Registro Exitoso: ");
        System.out.println("Nombre Completo: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Numero Registrado: " + getTelefono());
        System.out.println("Cedula: " + getCedula());
        System.out.println("ID Unico: " + getID());
        System.out.println("Correo del Usuario: " + getCorreo());
        System.out.println("Contraseña: " + getContraseña());
        // private String Direccion;
    }
    
    public void ValidacionRegistro(String Nombre, String Ced, String CorrEl, String Tel, String Pass, String edad, String Direccion) {
        setNombre(Nombre);
        setCedula(Integer.parseInt(Ced));
        setCorreo(CorrEl);
        setTelefono(Tel);
        setContraseña(Pass);
        setEdad(edad);
        setDireccion(Direccion);
        
        System.out.println("Registro Exitoso: ");
        System.out.println("Nombre Completo: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Numero Registrado: " + getTelefono());
        System.out.println("Cedula: " + getCedula());
        System.out.println("ID Unico: " + getID());
        System.out.println("Correo del Usuario: " + getCorreo());
        System.out.println("Contraseña: " + getContraseña());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getContraseña());
        
    }
    
    
    public void AñadiraBasedeDatos (Connection cn,String Nombre, String Ced, String CorrEl, String Tel, String Pass, String edad, String Direccion){
         usuarios us = new usuarios(Nombre, edad, Direccion, Tel, 0, 0, CorrEl, CorrEl) {
             @Override
             public void Registrar() {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             }
         };
    try {
               int cedula = Integer.parseInt(Ced);
        
               if (CorrEl.contains("@") && CorrEl.contains(".com")) {
                   try{
                   String consulta= " insert into registroCliente (id, Nombre, Edad, Direccion, telefono, Correo, Contraseña, Cedula) values('"+ us.getID() +"', '"+Nombre+"', '"+edad+"', '"+Direccion+"', '"+Tel+"', '"+CorrEl+"',  '"+Pass+"',  '"+Ced+"' )";
                   PreparedStatement ps = cn.prepareStatement(consulta);
                   ps.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Registro exitoso!");
                   con.desconectar();
                   }catch(SQLException e){
                       JOptionPane.showMessageDialog(null, "No se pudo registrar usuario");
                       e.printStackTrace();
                   
                   }
               
              } else {
                JOptionPane.showMessageDialog(null, "El correo electronico debe de contener @ y .com");
               }
          } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "La cédula debe de ser un numero entero");

            }
    }
    

   
}
