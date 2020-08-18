
package guia.pkg5;
import guia.pkg5.exception.NoexistePersona ;

public class Guia5 {

 
    public static void main(String[] args) {
        
        Cliente persona1=new Cliente(1,"Dominguez Agustin ",39170518);
         Cliente persona2=new Cliente(2,"Dip Elizabeth",16685789);
         
         Premiacion premio=new Premiacion();
         
         premio.addCliente(persona1.getNombre(), persona1);
         premio.addCliente(persona2.getNombre(), persona2);
         
         try{
             premio.getWinner("Perez Juan");
         }catch(NoexistePersona e){
             System.out.println("Esa persona no existe");
         }
     
     /*Vehiculo tutu=new Vehiculo("abc 123",Vehiculo.marcaAuto.FORD);
         System.out.println(tutu);*/
      
    }
    
}
