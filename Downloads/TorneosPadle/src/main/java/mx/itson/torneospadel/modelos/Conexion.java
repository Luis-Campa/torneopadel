/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.modelos;



import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisantoniocamparubio
 */
public class Conexion {
    
     String usuario = "u45foplwxbgwy";
    String clave = "camaronesITSON";
    String url = "jdbc:mysql://pitalla.mx/db3b3p76lp779g?serverTimezone=UTC";
    Connection con;
    Statement stmt;
    ResultSet rs;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert(String consulta) {
        try {
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet select(String consulta) {
        try {
            rs = stmt.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static void main(String[] args) {

  

    Conexion test = new Conexion();

    // Inserta un nuevo jugador (corregido: faltaba un paréntesis y 'ciudad' estaba mal escrito)
    test.insert("INSERT INTO jugadores (nombre, correo, telefono, nivel, ciudad, edad) "
            + "VALUES ('luis', 'campa@gmail.com', '6221725053', '7', 'guaymas', '19');");

    // Consulta todos los jugadores
    ResultSet rs = test.select("SELECT * FROM jugadores");

    try {
        if (rs != null) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }
        } else {
            System.out.println("No se pudo obtener resultados (rs = null).");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
}

     
    
}
