/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.samfc.caso1unidad7;

import es.samfc.caso1unidad7.common.Coche;
import es.samfc.caso1unidad7.common.CocheKm0;
import es.samfc.caso1unidad7.common.CocheNuevo;
import es.samfc.caso1unidad7.common.CocheSegundaMano;

/**
 *
 * @author samue
 */
public class Main {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("7905 KOF", "Alfa Romeo 4C Cabrio", "Rojo");
        CocheNuevo coche2 = new CocheNuevo("8321 MPD", "Aston Martin DBS Superleggera", "Verde");
        CocheKm0 coche3 = new CocheKm0("3079 UVW", "Jaguar F-TYPE 2019 Coupe", "Blanco", 50);
        CocheSegundaMano coche4 = new CocheSegundaMano("6270 ULE", "McLaren P1 2013", "Naranja", 4000, "Ignacio San Juan");
        
        coche1.visualizar();
        coche2.visualizar();
        coche3.visualizar();
        coche4.visualizar();
        
        
    }
    
}
