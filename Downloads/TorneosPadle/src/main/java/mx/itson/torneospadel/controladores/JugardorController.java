/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.controladores;

import java.util.ArrayList;
import mx.itson.torneospadel.entidades.Jugador;
import mx.itson.torneospadel.modelos.JugadorModel;

/**
 *
 * @author luisantoniocamparubio
 */
public class JugardorController {
    
    JugadorModel modelo = new JugadorModel();
    
    
    public   ArrayList<Jugador> listar(){
        ArrayList<Jugador> lista = modelo.listar();
        return lista;
                
                
    }
    
}
