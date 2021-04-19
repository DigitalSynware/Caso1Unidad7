/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.samfc.caso1unidad7.common;

/**
 *
 * @author samue
 */
public class Coche {
    
    private String matricula;
    private String modelo;
    private String color;

    /**
     * Constructor de la clase Coche.
     * Esta clase nos servira para definir los metodos
     * y atributos que tendran los tipos de coches en comun
     * 
     * @param matricula Matricula que tendra el coche
     * @param modelo Modelo del coche
     * @param color Color del coche
     */
    public Coche(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Metodo de obtencion de matricula
     * @return Matricula del coche
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Metodo de definicion de matricula
     * @param matricula Matricula del coche
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo de obtencion de modelo
     * @return Modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo de definicion de modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo de obtencion de color
     * @return Color del coche
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo de definicion de color
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Metodo de visualizacion de datos.
     * Con este metodo se podra visualizar
     * los datos del coche. En caso de ser
     * una clase hijo, puede mostrar mas
     * informacion en caso de haberla
     */
    public void visualizar(){
        System.out.println("");
        System.out.println("====================================");
        System.out.println("Tipo de vehiculo: " + this.getClass().getSimpleName());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
    }
    
    
}
