/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.itson.torneospadel.entidades.Jugador;

/**
 *
 * @author luisantoniocamparubio
 */
public class JugadorModel {
    
    Conexion con = new Conexion();
    
    // Crear jugador
    public void crear(){
        // pendiente implementar
    }
    
    // Editar jugador
    public void editar(){
        // pendiente implementar
    }

    // Eliminar jugador
    public void eliminar(){
        // pendiente implementar
    }
    
    // Listar jugadores
    public ArrayList<Jugador> listar(){
         
        ArrayList<Jugador> lista = new ArrayList<Jugador>();

        try {
            ResultSet rs = con.select("SELECT * FROM jugadores");

            while (rs.next()){
                lista.add(new Jugador(
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("correo"),
                    rs.getInt("nivel"),
                    rs.getInt("edad")
                ));
            }

        } catch (SQLException e) {
            Logger.getLogger(JugadorModel.class.getName()).log(Level.SEVERE, null, e);
        }

        return lista;
    }

    // Ver jugador
    public void ver(){
        // pendiente implementar
    }

    // Iniciar sesión
    public void iniciarSesion(){
        // pendiente implementar
    }
}

