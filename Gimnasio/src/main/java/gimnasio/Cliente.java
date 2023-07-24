/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author pablo
 */
public class Cliente extends usuarios {
    Random random = new Random();
    
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
    
   
}
