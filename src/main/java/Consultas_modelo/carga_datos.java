/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas_modelo;

/**
 *
 * @author mmayo
 */
public class carga_datos {
    private int id;
    private int jaula;
    private String nro;
    private String especie;
    private String f_nacimiento;
    private String clase;
    private String f_fallecimiento;
    private String causa;

    public carga_datos() {
    }

    public carga_datos(int id, int jaula, String nro, String especie, String f_nacimiento, String clase, String f_fallecimiento, String causa) {
        this.id = id;
        this.jaula = jaula;
        this.nro = nro;
        this.especie = especie;
        this.f_nacimiento = f_nacimiento;
        this.clase = clase;
        this.f_fallecimiento = f_fallecimiento;
        this.causa = causa;
    }

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getF_fallecimiento() {
        return f_fallecimiento;
    }

    public void setF_fallecimiento(String f_fallecimiento) {
        this.f_fallecimiento = f_fallecimiento;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

    