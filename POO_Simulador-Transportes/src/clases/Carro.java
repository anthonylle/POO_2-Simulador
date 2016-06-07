package clases;



/**
 * 
 */
public class Carro extends Vehiculo {

    /**
     * Default constructor
     */
    
    public Carro() {
        super(40,"CAR",530.0);
    }

    /**
     * @param  cantKm 
     * @return
     */
    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        // TODO implement here
        return cantKm*3.9;
    }
    
    @Override
    public void reparar(){
        super.vidaUtil = (int) super.vidaUtil / 5;
    }

}