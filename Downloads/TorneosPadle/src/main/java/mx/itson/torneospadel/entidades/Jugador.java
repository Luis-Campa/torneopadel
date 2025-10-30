/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Jugador {

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", nivel=" + nivel + ", cuidad=" + cuidad + ", edad=" + edad + '}';
    }
   private String nombre;
    private String telefono;
    private String correo;
    private int nivel;
    private String cuidad;
    private int edad;

    public Jugador(String nombre, String telefono, String correo, int nivel, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel = nivel;
        this.cuidad = cuidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
