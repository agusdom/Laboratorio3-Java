
package guia.pkg5;

public class Vehiculo {
    
    private String matricula;
    
    private String marca;

    private marcaAuto status;
  public enum marcaAuto{
      FORD,
      TOYOTA, 
      SUZUKI, 
      RENAULT;
      
  }

    public Vehiculo(String matricula,marcaAuto status) {
        this.matricula = matricula;
        this.marca = marca;
        this.status = status;
    }
  
  

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public marcaAuto getStatus() {
        return status;
    }

    public void setStatus(marcaAuto status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + status + '}';
    }

 
   

  
           
    
    
}
