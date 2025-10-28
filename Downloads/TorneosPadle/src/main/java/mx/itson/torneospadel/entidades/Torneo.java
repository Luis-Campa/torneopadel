/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Torneo {

    public Torneo(String nombre, Club club, String fecha, double precio, int nivel) {
        this.nombre = nombre;
        this.club = club;
        this.fecha = fecha;
        this.precio = precio;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", club=" + club + ", fecha=" + fecha + ", precio=" + precio + ", nivel=" + nivel + '}';
    }
    private String nombre;
     private Club club ;
    private String fecha ;
   private double precio;
    private int nivel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
