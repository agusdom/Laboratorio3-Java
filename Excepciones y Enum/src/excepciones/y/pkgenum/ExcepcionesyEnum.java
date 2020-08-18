
package excepciones.y.pkgenum;


import excepciones.y.pkgenum.Exception.ClienteNoExisteException;
import java.util.*;


public class ExcepcionesyEnum {

    
    public static void main(String[] args) {
        Vehiculo car=new Vehiculo("abc 123",Vehiculo.MarcaVehiculo.RENAULT);
        HashSet<Vehiculo>tutu=new HashSet<>();
        tutu.add(car);
        for (Vehiculo v : tutu) {
            System.out.println(v.toString());
            
        }
        
        Cliente person=new Cliente("Perez Juan","16685789",1);
        Banco bank=new Banco();
        bank.add(person.getNombre(), person);
        try{
            bank.getClientela("Perez Juan");
            System.out.println("El es el ganador");
        }catch(ClienteNoExisteException e){
            System.out.println("La persona no existe");
        }
      
    }
    
}
