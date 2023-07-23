/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

/**
 *
 * @author javie
 */
public class Verificador {
    String Usuario;
    String UsuarioPass;
    
    String Instructor;
    String InstructorPass;
    
    String RecibirUsuario;
    String RecibirPass;

    public Verificador() {}

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setUsuarioPass(String UsuarioPass) {
        this.UsuarioPass = UsuarioPass;
    }

    public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }

    public void setInstructorPass(String InstructorPass) {
        this.InstructorPass = InstructorPass;
    }

    public void setRecibirUsuario(String RecibirUsuario) {
        this.RecibirUsuario = RecibirUsuario;
    }

    public void setRecibirPass(String RecibirPass) {
        this.RecibirPass = RecibirPass;
    }

    public boolean VerificarCliente() {
        return RecibirUsuario.equals(Usuario) && RecibirPass.equals(UsuarioPass); // Credenciales válidas para el cliente
        // Credenciales incorrectas
    }
    
    public boolean VerificarInstructor() {
        return RecibirUsuario.equals(Instructor) && RecibirPass.equals(InstructorPass); // Credenciales válidas para el cliente
    }
}

