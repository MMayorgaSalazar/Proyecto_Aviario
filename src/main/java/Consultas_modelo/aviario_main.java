/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas_modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mmayo
 */

public class aviario_main {
    //definicion de la variable usada para realizar la coneccion a la bd
    Conexion_bd cn = new Conexion_bd();
    //def de la importacion Connection para usarla en el codigo
    Connection con;
    //def de la importacion PreparedStatement para usarla en el codigo
    PreparedStatement ps;
    
    public boolean RegistrarAve(aviario a){
        //creamos la consulta que se hara a la base de datos
        String sql = "INSERT INTO ave(JAULA, NRO_AVE, ESPECIE, F_NAC, CLASE) VALUES (?, ?, ?, ?, ?)";
        try{
            //realizamos la coneccion a la bd
            con = cn.getConnection();
            if(con == null){
                //sistema de validacion para verificar la correcta coneccion con la bd
                JOptionPane.showMessageDialog(null, "Error: no se pudo conectar a la base de datos.");
                return false;
            }
            
            //Comenzamos a pasar los datos en las respectivas columnas señaladas en la consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getJaula());
            ps.setString(2,a.getNro());
            ps.setString(3, a.getEspecie());
            ps.setString(4, a.getF_nacimiento());
            ps.setString(5, a.getClase());
            ps.execute();
            return true;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try{
                if(con != null){
                    con.close();
                }
            }catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        //return false;
    }
    
    public boolean Eliminar(int id){
        String sql = "DELETE FROM ave WHERE ID = ?";
        //iniciamos la conexion con la bd
        con = cn.getConnection();
        try{
            //cuando se conecta realizamos la consulta sql definida anteriormente
            ps = con.prepareStatement(sql);
            //entregamos el ID de la fila seleccionada
            ps.setInt(1, id);
            //se ejecuta la consulta
            ps.execute();
            return true;
        }catch (SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                if (con != null) {
                con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
