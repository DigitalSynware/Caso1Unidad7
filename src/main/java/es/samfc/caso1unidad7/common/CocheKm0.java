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
public class CocheKm0 extends Coche {
    
    private int kilometros;

    public CocheKm0(String matricula, String modelo, String color, int kilometros) {
        super(matricula, modelo, color);
        this.kilometros = kilometros;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Kilometros: " + getKilometros());
    }
    
}
