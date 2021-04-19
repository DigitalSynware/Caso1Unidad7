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

    public Coche(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void visualizar(){
        System.out.println("");
        System.out.println("====================================");
        System.out.println("Tipo de vehiculo: " + this.getClass().getSimpleName());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
    }
    
    
}
