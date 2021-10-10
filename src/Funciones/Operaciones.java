/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Operaciones extends Conexion{
    public void tipoDeCambio(){
      //cr.fi.bccr.indicadoreseconomicos.wsIndicadoresEconomicos cliente = new cr.fi.bccr.indicadoreseconomicos.wsIndicadoresEconomicos();
      
    }
    public void almacenar(String nombre,String fecha,String telefono,
            String otroTelef,String cedulaF,String cedulaJ,String correo,
            String producto,String numCoti,String notas, String direccion,
            String estado_efectivo,String ext1,String ext2,Double montoAdelanto){
        
            String insercion = "INSERT INTO CLIENTES (NOMBRE_CLIENTE,FECHA,"
            + "ESTADO_EFECTIVO,TELEFONO,TELEFONO_2,CEDULA_FISICA,"
            + "CEDULA_JURIDICA,CORREO,PRODUCTO,NUMERO_COTIZACION,NOTA,DIRECCION,"
            + "EXTENSION1,EXTENSION2,MONTO)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
        try {
             conexion();
             PreparedStatement st = conexion.prepareStatement(insercion);
             st.setString(1,nombre);
             st.setString(2,fecha);
             st.setString(3,estado_efectivo);
             st.setString(4,telefono);
             st.setString(5,otroTelef);
             st.setString(6,cedulaF);
             st.setString(7,cedulaJ);
             st.setString(8,correo);
             st.setString(9,producto);
             st.setString(10,numCoti);
             st.setString(11,notas);
             st.setString(12,direccion);
             st.setString(13, ext1);
             st.setString(14, ext2);
             st.setDouble(15, montoAdelanto);
             st.executeUpdate();
             st.close();
             conexion.close();
             JOptionPane.showMessageDialog(null,"DATOS GUARDADOS CON ÉXITO ! ! ! ","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR DE INSERCIÓN EN LA BASE DE DATOS ! ! !"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }   
    }
    public void consultarClientes(DefaultTableModel defaultTableModel){
        conexion();
        ArrayList <Object> nombres = new ArrayList<>();
        try{
        String consulta = "SELECT ID_CLIENTE,FECHA,NOMBRE_CLIENTE,PRODUCTO,ESTADO_NOTA FROM CLIENTES";
        conexion();
        
        ResultSet result = null;
    
       PreparedStatement st = conexion.prepareStatement(consulta);
       result = st.executeQuery();
       if(result!= null){
        int numeroClumna = result.getMetaData().getColumnCount(); //obtiene el numero de columnas 
        defaultTableModel.setRowCount(0);
        
        while (result.next()) {            
           Object [] objetos = new Object[numeroClumna];
           for(int i = 1; i<=numeroClumna;i++){
               objetos[i-1] = result.getObject(i);
           }
            defaultTableModel.addRow(objetos);    
        } 
    }    
         st.close();
        // conexion.close();
    }
        catch(SQLException e){
      JOptionPane.showMessageDialog(null,"Conexion no establecida"
                +e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    }}
    public void consultarClientes(DefaultTableModel defaultTableModel,String parametroBusqueda){
        conexion();
        
         String filtro = "%"+parametroBusqueda+"%";
//        String SQL = "SELECT * FROM CLIENTES WHERE NOMBRE_CLIENTE LIKE"+'"'+filtro+'"';
        try{
        String consulta = "SELECT ID_CLIENTE,FECHA,NOMBRE_CLIENTE,PRODUCTO,ESTADO_NOTA FROM CLIENTES WHERE NOMBRE_CLIENTE LIKE"+'"'+filtro+'"'+
                "OR PRODUCTO LIKE"+'"'+filtro+'"'+"OR ESTADO_NOTA LIKE"+'"'+filtro+'"'+"OR FECHA LIKE"+'"'+filtro+'"';
        conexion();
        
        ResultSet result = null;
    
       PreparedStatement st = conexion.prepareStatement(consulta);
       result = st.executeQuery();
       if(result!= null){
        int numeroClumna = result.getMetaData().getColumnCount(); //obtiene el numero de columnas 
        defaultTableModel.setRowCount(0);
        
        while (result.next()) {            
           Object [] objetos = new Object[numeroClumna];
           for(int i = 1; i<=numeroClumna;i++){
               objetos[i-1] = result.getObject(i);
           }
            defaultTableModel.addRow(objetos);    
        } 
    }    
         st.close();
        // conexion.close();
    }
        catch(SQLException e){
     
    } }
    public ArrayList<String> consultaNota (int id_cliente){
       ArrayList <String> datos = new ArrayList();
        try {
             conexion();
             String consulta = "SELECT * FROM CLIENTES WHERE ID_CLIENTE ="+"'"+id_cliente+"'";
             PreparedStatement ps = conexion.prepareStatement(consulta);
             
             ResultSet resultSet = null;
             resultSet = ps.executeQuery();
           
             for (int i = 1; i <= 17; i++) {
              datos.add(resultSet.getString(i));  
            }
             
          ps.close();  
          conexion.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Conexion no establecida"
                +e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
    public void eliminarCliente(int id_Cliente){
        conexion();
        String eliminacion = "DELETE FROM CLIENTES WHERE ID_CLIENTE ="+id_Cliente;
        
        try {
            PreparedStatement st = conexion.prepareStatement(eliminacion);
            st.executeUpdate();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error de Eliminación . . . ! ! !"
                +ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    public void modificarCliente(int id_cliente,String nombreCliente,
            String fecha,String estadoNota,String estado_efectivo,
            String telefonoP,String otroTelef,String cedulaF,String cedulaJ,
            String correo,String producto, String numCoti,String notas,
            String direccion,String ext1,String ext2,Double montoAdelanto){
        
  String modificacion = "UPDATE CLIENTES SET NOMBRE_CLIENTE = ?,FECHA = ?,"
    + "ESTADO_NOTA = ?,ESTADO_EFECTIVO = ?,TELEFONO = ?,TELEFONO_2 = ?,CEDULA_FISICA = ?,"
    + "CEDULA_JURIDICA = ?,CORREO = ?,PRODUCTO = ?,NUMERO_COTIZACION = ?,NOTA = ?,"
    + "DIRECCION = ?,EXTENSION1 = ?,EXTENSION2 = ?,MONTO = ?"
    + "WHERE ID_CLIENTE = "+id_cliente; 
       
        try {
             conexion();
             PreparedStatement st = conexion.prepareStatement(modificacion);
             st.setString(1,nombreCliente);
             st.setString(2,fecha);
             st.setString(3, estadoNota);
             st.setString(4,estado_efectivo);
             st.setString(5,telefonoP);
             st.setString(6,otroTelef);
             st.setString(7,cedulaF);
             st.setString(8,cedulaJ);
             st.setString(9,correo);
             st.setString(10,producto);
             st.setString(11,numCoti);
             st.setString(12,notas);
             st.setString(13,direccion);
             st.setString(14,ext1);
             st.setString(15,ext2);
             st.setDouble(16,montoAdelanto);
             st.executeUpdate();
             st.close();
             conexion.close();
             JOptionPane.showMessageDialog(null,"DATOS GUARDADOS CON ÉXITO ! ! ! ","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR DE INSERCIÓN EN LA BASE DE DATOS  ! ! !"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }   
        
    }
     
}

    

