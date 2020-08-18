
public class Alumno extends Persona {

   private  int ingreso;
   private   double cuota;
   private   String carrera;
 

    public Alumno(int ingreso, double cuota, String carrera, String nombre, String apellido, int Dni, String email, String direccion) {
        super(nombre, apellido, Dni, email, direccion);
        this.ingreso = ingreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ingreso=" + ingreso + ", cuota=" + cuota + ", carrera=" + carrera + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", email=" + email + ", direccion=" + direccion +'}';
    }

  


  
    

    
    
}
