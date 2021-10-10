/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    Connection conexion;
    public void conexion(){
    try {
     //String ruta=System.getProperty("user.dir");
    conexion = DriverManager.getConnection("jdbc:sqlite:C:\\DB\\DataB.db"); 
    
    if(conexion!=null){
    System.out.println("Conectado");
    // JOptionPane.showMessageDialog(null, ruta);
    }
    } 
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Conexion no establecida"
                +e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    }}
    public void cerrarConexion(){
    try {
        System.out.println("Conexion Cerrada");
    conexion.close();
    
    } catch (SQLException e) {
    e.printStackTrace();
    }}
    }
