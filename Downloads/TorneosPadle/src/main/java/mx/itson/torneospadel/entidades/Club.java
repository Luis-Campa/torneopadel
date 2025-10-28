/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Club {

    public Club(String nombre, String direccion, String cuidad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuidad = cuidad;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Club{" + "nombre=" + nombre + ", direccion=" + direccion + ", cuidad=" + cuidad + ", telefono=" + telefono + '}';
    }
    private String nombre;
    private String direccion;
    private String cuidad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
