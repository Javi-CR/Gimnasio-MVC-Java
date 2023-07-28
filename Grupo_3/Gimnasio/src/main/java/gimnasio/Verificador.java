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
    private String Usuario;
    private String UsuarioPass;
    
    private String Instructor;
    private String InstructorPass;
    
    private String RecibirUsuario;
    private String RecibirPass;

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
    
    public void ValidarIniciarS(String A, String B) {
        
        setRecibirUsuario(A);
        setRecibirPass(B);
        
    }
    
    public void ValidarUsuario(String C, String D) {
        
        setUsuario(C);
        setUsuarioPass(D);
        
    }
    
    public void ValidarInstructor(String E, String F) {
        
        setInstructor(E);
        setInstructorPass(F);
        
    }
    public void Validar() {
        System.out.println("R: "+Usuario);
        System.out.println("R: "+UsuarioPass);
        System.out.println("");
        System.out.println("R: "+Instructor);
        System.out.println("R: "+InstructorPass);
        System.out.println("");
        System.out.println("R: "+RecibirUsuario);
        System.out.println("R: "+RecibirPass);
        
        
    }
    public boolean VerificarCliente() {
        return RecibirUsuario.equals(Usuario) && RecibirPass.equals(UsuarioPass); // Credenciales válidas para el cliente
    }
    
    public boolean VerificarInstructor() {
        return RecibirUsuario.equals(Instructor) && RecibirPass.equals(InstructorPass); // Credenciales válidas para el cliente
    }
}

