/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Jhonny
 */
public class Hotel {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.habitacionesDisponibles = new ArrayList<>();
    }
    
    public boolean crearHabitacion(String numero, int capacidad, String descripcion, double valorPorDia, String nombreImagen){
        Habitacion habitacion = new Habitacion(numero, capacidad, descripcion, valorPorDia, nombreImagen);
        this.habitaciones.add(habitacion);
        return true;
    }
    
    public Habitacion consultarHabitacion(String numero){
        int posicion = -1;
        for(int i = 0; i < this.habitaciones.size(); i++){
            if(this.habitaciones.get(i).getNumeroHabitacion().equals(numero)){
                posicion = i;
            }
        }
        return this.habitaciones.get(posicion);
    }
    
    public ArrayList<Habitacion> consultarHabitacionesDisponibles(){
        int posicion = -1;
        for(int i = 0; i <= this.habitaciones.size(); i++){
            if(this.habitaciones.get(i).isDisponibilidad() == true){
                this.habitacionesDisponibles.add(this.habitaciones.get(i));
            }
        }
        return this.habitacionesDisponibles;
    }
    
    
    
    
}
