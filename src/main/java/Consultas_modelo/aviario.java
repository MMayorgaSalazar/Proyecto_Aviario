    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas_modelo;

/**
 *
 * @author mmayo
 */
public class aviario {
    //definicion de datos a trabajar
    private int id;
    private int jaula;
    private String nro;
    private String especie;
    private String f_nacimiento;
    private String clase;
    private String f_fallecimiento;

    //Creacion de constructor vacio
    public aviario() {
    }
    //Creacion  de constructor usando todas los datos a trabajar
    public aviario(int id, int jaula,String nro, String especie, String f_nacimiento, String clase, String f_fallecimiento) {
        this.id = id;
        this.jaula = jaula;
        this.nro = nro;
        this.especie = especie;
        this.f_nacimiento = f_nacimiento;
        this.clase = clase;
        this.f_fallecimiento = f_fallecimiento;
    }

    //Creacion de getter and setter de cada uno de los datos a trabajar
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }
    
}
