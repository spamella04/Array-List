/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Synthia Pamella
 */
public class Producto {
    
    private int id;
    private String nombre;
    private double percio;
    private double existencia;

    public Producto() {
    }

    public Producto(int id, String nombre, double percio, double existencia) {
        this.id = id;
        this.nombre = nombre;
        this.percio = percio;
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPercio() {
        return percio;
    }

    public void setPercio(double percio) {
        this.percio = percio;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", percio=" + percio + ", existencia=" + existencia + '}';
    }
    
    
}
