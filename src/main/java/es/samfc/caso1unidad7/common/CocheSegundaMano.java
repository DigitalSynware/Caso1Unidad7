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
public class CocheSegundaMano extends Coche {
    
    private int kilometros;
    private String propietarioAnterior;

    public CocheSegundaMano(String matricula, String modelo, String color, int kilometros, String propietarioAnterior) {
        super(matricula, modelo, color);
        this.kilometros = kilometros;
        this.propietarioAnterior = propietarioAnterior;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getPropietarioAnterior() {
        return propietarioAnterior;
    }

    public void setPropietarioAnterior(String propietarioAnterior) {
        this.propietarioAnterior = propietarioAnterior;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Kilometros: " + getKilometros());
        System.out.println("Propietario anterior: " + getPropietarioAnterior());
    }
    
    
    
}
