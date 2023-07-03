/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Cliente extends Usuarios {

    public Cliente(String Nombre, String Edad, String Direccion, String telefono, int Cedula, int ID, String Correo, String Contraseña) {
        super(Nombre, Edad, Direccion, telefono, Cedula, ID, Correo, Contraseña);
    }

    @Override
    public void Registrar() {
        setNombre(JOptionPane.showInputDialog(
                 "Ingrese su nombre completo: "));
        setCedula( Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cédula")));
        
        setEdad(JOptionPane.showInputDialog(
                "Ingrese su edad: "));
        setTelefono(JOptionPane.showInputDialog("Ingrese su telefono: "));
        
        setID(1342);
        
        setCorreo(JOptionPane.showInputDialog("Ingrese su correo electronico: "));
        
        setContraseña(JOptionPane.showInputDialog("Ingrese su contraseña: "));
        
 

        System.out.println("Registro Exitoso: ");
        System.out.println("Nombre Completo: " +getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Numero Registrado: " + getTelefono());
        System.out.println("Cedula: " + getCedula());
        System.out.println("ID Unico: " + getID());
        System.out.println("Correo del Usuario: " + getCorreo());
        System.out.println("Contraseña: " + getContraseña());
        // private String Direccion;
    }
}