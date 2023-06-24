/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupo_3_pfa_avance;

/**
 *
 * @author javie
 */
public class Usuarios {
    private String Nombre;
    private String Edad;
    private String Direccion;
    private String telefono;
    private String Correo;
    private String Contraseña;
    private int Cedula;
    private int ID ;

    public Usuarios(String Nombre, String Edad, String Direccion, String telefono, String Correo, String Contraseña, int Cedula, int ID) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.Cedula = Cedula;
        this.ID = ID;
    }

    
    public void Registrado() {
        System.out.println("Registro Exitoso: ");
        System.out.println("Nombre Completo: "+ Nombre);
        System.out.println("Edad: "+ Edad);
        System.out.println("Direccion: "+ Direccion);
        System.out.println("Numero Registrado: "+ telefono);
        System.out.println("Cedula: "+ Cedula);
        System.out.println("ID Unico: "+ ID);
        System.out.println("Correo del Usuario: "+ Correo);
        System.out.println("Contraseña: "+ Contraseña);
           
        
    }
}
