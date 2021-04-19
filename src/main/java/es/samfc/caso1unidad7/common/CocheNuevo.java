package es.samfc.caso1unidad7.common;

/**
 * Clase de coches nuevos.
 * 
 * Esta clase, que hereda todos los atributos y metodos de la 
 * clase {@link Coche Coche.class}, se usara para coches
 * nuevos.
 * 
 * @author Samuel Fernandez Cardenas
 */
public class CocheNuevo extends Coche {
    
    /**
     * Constructor de la clase CocheNuevo.
     * 
     * @param matricula Matricula que tendra el coche
     * @param modelo Modelo del coche
     * @param color Color del coche
     */
    public CocheNuevo(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
    }
    
}
