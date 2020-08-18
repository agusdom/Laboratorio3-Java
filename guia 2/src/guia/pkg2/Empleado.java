
package guia.pkg2;

public class Empleado {
    
    private long dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(long dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    
    public double SalarioAnual(){
        
        return (salario*12);
    }
    
    public double SalarioConAumento(int aumento) {
        double resultado=0.0;
        resultado=(salario+(salario*aumento)/100);
        return resultado*12;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';
    }

  

   
    
    
    
    
}
