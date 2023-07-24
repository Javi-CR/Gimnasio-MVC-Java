/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import javax.swing.JOptionPane;

/**
 *
 * @author arjoz
 */
public class Intructor extends usuarios {

    private String especialidad;
    private String UsuarioIntru;
   

    private String UsuarioAdminGym = "admin123";
    private String ContraseñaAdminGym = "123";

    public Intructor(String Nombre, String Edad, String Direccion, String telefono, int Cedula, int ID, String Correo, String Contraseña) {
        super(Nombre, Edad, Direccion, telefono, Cedula, ID, Correo, Contraseña);
        this.UsuarioAdminGym = UsuarioAdminGym;
        this.ContraseñaAdminGym = ContraseñaAdminGym;
        this.UsuarioIntru = UsuarioIntru;
        this.especialidad = especialidad;
    }

    public String getUsuarioAdminGym() {
        return UsuarioAdminGym;
    }

    public void setUsuarioAdminGym(String UsuarioAdminGym) {
        this.UsuarioAdminGym = UsuarioAdminGym;
    }

    public String getContraseñaAdminGym() {
        return ContraseñaAdminGym;
    }

    public void setContraseñaAdminGym(String ContraseñaAdminGym) {
        this.ContraseñaAdminGym = ContraseñaAdminGym;
    }

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
        
        UsuarioIntru = JOptionPane.showInputDialog("Ingrese el nombre de usuario del instructor: ");
        especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del instructor: ");
        
        

        System.out.println("Registro Exitoso: ");
        System.out.println("Nombre Completo: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Numero Registrado: " + getTelefono());
        System.out.println("Cedula: " + getCedula());
        System.out.println("ID Unico: " + getID());
        System.out.println("Correo del Usuario: " + getCorreo());
        System.out.println("Contraseña: " + getContraseña());
        System.out.println("Usuario Intructor: " + UsuarioIntru);
        System.out.println("Especialidad del instructor: "+ especialidad);
        
        // private String Direccion;
    }
    
     public void ValidacionRegistroInstrucAdmi( String nombreusuario, String Contra ) {
        UsuarioAdminGym = nombreusuario;
        ContraseñaAdminGym = Contra;
    }
     
      public void ValidacionRegistroInstruc(String Nombre, String Ced, String CorrEl, String Tel, String Pass, String edad, String Direccion, String User, String especialidadI) {
        setNombre(Nombre);
        setCedula(Integer.parseInt(Ced));
        setCorreo(CorrEl);
        setTelefono(Tel);
        setContraseña(Pass);
        setEdad(edad);
        setDireccion(Direccion);
        
        UsuarioIntru = User;
        especialidad = especialidadI;
        
        
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
        System.out.println("User Instructor: " + UsuarioIntru);
        System.out.println("Especialidad: " + especialidad);
        
    }
     

}
