
package guia3;

import java.util.UUID;


public class Cliente{
   private  UUID Id;
   private  String Nombre;
   private  String Email;
   private  double Descuento;

    public Cliente(String Nombre,String Email,double Descuento) {
        this.Id=UUID.randomUUID();
        this.Nombre=Nombre;
        this.Email=Email;
        this.Descuento=Descuento;
       }

        public UUID getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public double getDescuento() {
        return Descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", Nombre=" + Nombre + ", Email=" + Email + ", Descuento=" + Descuento + '}';
    }
   
    
   
   
   
}
