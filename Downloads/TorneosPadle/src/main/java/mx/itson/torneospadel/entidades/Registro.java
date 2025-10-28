/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Registro {

    public Registro(Jugador jugador, Torneo torneo, boolean estado, double costo) {
        this.jugador = jugador;
        this.torneo = torneo;
        this.estado = estado;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Registro{" + "jugador=" + jugador + ", torneo=" + torneo + ", estado=" + estado + ", costo=" + costo + '}';
    }
    private Jugador jugador ;
    private Torneo torneo;
    private boolean estado;
    private double costo ;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
