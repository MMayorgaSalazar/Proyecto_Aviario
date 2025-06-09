/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas_modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class carga_main {
    Conexion_bd cn = new Conexion_bd();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public List carga_datos(){
        List<carga_datos> lista = new ArrayList();
        String sql = "SELECT * FROM ave WHERE CLASE= 'Padre' ";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                carga_datos c = new carga_datos();
                c.setId(rs.getInt("ID"));
                c.setJaula(rs.getInt("JAULA"));
                c.setNro(rs.getString("NRO_AVE"));
                c.setEspecie(rs.getString("ESPECIE"));
                c.setF_nacimiento(rs.getString("F_NAC"));
                c.setClase(rs.getString("Clase"));
                c.setF_fallecimiento(rs.getString("F_FALLECIMIENTO"));
                c.setCausa(rs.getString("CAUSA"));
                lista.add(c);
                System.out.println("Jaula cargado: " + c.getJaula());
            }
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }
    
    public List carga_datos_H(){
        List<carga_datos> lista_h = new ArrayList();
        String sql = "SELECT * FROM ave WHERE CLASE= 'Hijo' ";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                carga_datos c = new carga_datos();
                c.setId(rs.getInt("ID"));
                c.setJaula(rs.getInt("JAULA"));
                c.setNro(rs.getString("NRO_AVE"));
                c.setEspecie(rs.getString("ESPECIE"));
                c.setF_nacimiento(rs.getString("F_NAC"));
                c.setClase(rs.getString("Clase"));
                c.setF_fallecimiento(rs.getString("F_FALLECIMIENTO"));
                c.setCausa(rs.getString("CAUSA"));
                lista_h.add(c);
                System.out.println("Jaula cargado: " + c.getJaula());
            }
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista_h;
    }
    public int contarAves() {
    int total = 0;
    String sql = "SELECT COUNT(NRO_AVE) AS total FROM ave";
    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            total = rs.getInt("total");
        }
    } catch (SQLException e) {
        System.out.println("Error al contar aves: " + e.toString());
    } finally {
        try { if (rs != null) rs.close(); } catch (SQLException e) {}
        try { if (ps != null) ps.close(); } catch (SQLException e) {}
        try { if (con != null) con.close(); } catch (SQLException e) {}
    }

    return total;
}
}
