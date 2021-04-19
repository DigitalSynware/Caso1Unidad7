package es.samfc.caso1unidad7.common;

/**
 * Clase de coches de KM0.
 * 
 * Esta clase, que hereda todos los atributos y metodos de la 
 * clase {@link Coche Coche.class}, se usara para coches
 * de kilometro 0, incluyendo un nuevo atributo que almacena
 * los kilometros que tiene el vehiculo.
 * 
 * @author Samuel Fernandez Cardenas
 */
public class CocheKm0 extends Coche {
    
    private int kilometros;

    /**
     * Constructor de la clase CocheKm0.
     * 
     * @param matricula Matricula que tendra el coche
     * @param modelo Modelo del coche
     * @param color Color del coche
     * @param kilometros Kilometros del coche
     */
    public CocheKm0(String matricula, String modelo, String color, int kilometros) {
        super(matricula, modelo, color);
        this.kilometros = kilometros;
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
    
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Kilometros: " + getKilometros());
    }
    
}
