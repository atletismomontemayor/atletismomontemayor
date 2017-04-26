/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jesús
 */
public class ConexionSQL {
    private Connection conexion = null;
    
    public ConexionSQL (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            if (conexion != null){
                System.err.println("Conexión iniciada");
            }
            
        }catch (ClassNotFoundException | SQLException e){
            System.err.println("Conexión iniciada");
        }
    }

    public Connection conectar() {
        return conexion;
    }
    
    public void desconectar() throws SQLException {
        conexion.close();
        conexion = null;
    }
}
