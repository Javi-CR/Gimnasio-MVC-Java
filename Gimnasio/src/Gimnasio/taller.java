/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gimnasio;
import java.util.Random;
/**
 *
 * @author diego
 */
public class taller {
    
    Random random = new Random();
    private int idClase;
    private String nombreTaller;
    private String nombreInstructor;
    private String horarioTaller;
    private String zona;
    private String nivel;
    private String descripcion;

    public taller(int idClase, String nombreTaller, String nombreInstructor, String horarioTaller,
                  String zona, String nivel, String descripcion) {
        this.idClase = random.nextInt(500)+1;
        this.nombreTaller = nombreTaller;
        this.nombreInstructor = nombreInstructor;
        this.horarioTaller = horarioTaller;
        this.zona = zona;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public String getHorarioTaller() {
        return horarioTaller;
    }

    public void setHorarioTaller(String horarioTaller) {
        this.horarioTaller = horarioTaller;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
