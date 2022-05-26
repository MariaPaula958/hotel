/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonny
 */
public class Habitacion {
    private String numeroHabitacion;
    private int capacidad;
    private String descripcion;
    private double valorPorDia;
    private ImageIcon foto;
    private boolean disponibilidad;

    public Habitacion(String numeroHabitacion, int capacidad, String descripcion, double valorPorDia, String nombreImagen) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
        this.valorPorDia = valorPorDia;
        this.foto = new ImageIcon(nombreImagen);
        this.disponibilidad = true;
    }

    public ImageIcon getFoto(){
        return this.foto;
    }
    /*
    public void mostrarImagen(){
        
        JLabel jlabel = new JLabel();
        JFrame jframe = new JFrame();
        jframe.setLayout(new FlowLayout());
        jframe.setSize(this.foto.getIconWidth(), this.foto.getIconHeight());
        jlabel.setIcon(this.foto);
        jframe.add(jlabel);
        jframe.setVisible(true);
    }
    */
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    
    public void setDisponibilidad(boolean disponible){
        this.disponibilidad = disponible;
    }
    
}
