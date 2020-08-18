
package excepciones.y.pkgenum;


public class Vehiculo {
    
    private String patente;
    private MarcaVehiculo marca;
    
    public enum MarcaVehiculo{
        
        FORD,
        SUZUKI,
        RENAULT,
        SEAT;
    } 

    public Vehiculo(String patente, MarcaVehiculo marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public MarcaVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVehiculo marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + '}';
    }
    
    
}
