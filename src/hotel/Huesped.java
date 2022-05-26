/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Date;

/**
 *
 * @author Jhonny
 */
public class Huesped {
    private String nombre;
    private String nacionalidad;
    private String correo;
    private Date fechaNacimiento;
    private String tipoIdentificacion;
    private String numeroIdentificacion;

    public Huesped(String nombre, String nacionalidad, String correo, Date fechaNacimiento, String tipoIdentificacion, String numeroIdentificacion) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public boolean adquirirHabitacion(){
        return true;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    
    
    
    
}
