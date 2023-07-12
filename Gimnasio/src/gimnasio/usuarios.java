/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimnasio;
import java.util.Random;
/**
 *
 * @author pablo
 */
public abstract class usuarios {
    Random random = new Random();
    /**
     * @param args the command line arguments
     */
    
    private String Nombre;
    private String Edad;
    private String Direccion;
    private String telefono;
    private String Correo;
    private String Contraseña;
    private int Cedula;
    private int ID;

    public usuarios(String Nombre, String Edad, String Direccion, String telefono, int Cedula, int ID, String Correo, String Contraseña) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.Cedula = Cedula;
        this.ID = random.nextInt(200)+1;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public abstract void Registrar();
    
}

