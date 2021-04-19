package es.samfc.caso1unidad7.common;


/**
 * Clase de coches de segunda mano.
 * 
 * Esta clase, que hereda todos los atributos y metodos de la 
 * clase {@link Coche Coche.class}, se usara para coches
 * de segunda mano. Incluye metodos adicionales como el
 * kilometraje y el propietario anterior.
 * 
 * @author Samuel Fernandez Cardenas
 */
public class CocheSegundaMano extends Coche {
    
    private int kilometros;
    private String propietarioAnterior;

    
    /**
     * Constructor de la clase CocheNuevo.
     * 
     * @param matricula Matricula que tendra el coche
     * @param modelo Modelo del coche
     * @param color Color del coche
     * @param kilometros Kilometraje del coche  
     * @param propietarioAnterior Propietario anterior del vehiculo
     * 
     */
    public CocheSegundaMano(String matricula, String modelo, String color, int kilometros, String propietarioAnterior) {
        super(matricula, modelo, color);
        this.kilometros = kilometros;
        this.propietarioAnterior = propietarioAnterior;
    }

    /**
     * Metodo de obtencion de kilometraje
     * @return Kilometros del coche
     */
    public int getKilometros() {
        return kilometros;
    }

    /**
     * Metodo de definicion de kilometraje
     * @param kilometros Kilometros del coche
     */
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    /**
     * Metodo de obtencion de propietario anterior
     * @return Propietario anterior del vehiculo
     */
    public String getPropietarioAnterior() {
        return propietarioAnterior;
    }

    /**
     * Metodo de definicion de propietario anterior
     * @param propietarioAnterior Propietario anterior del vehiculo
     */
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
