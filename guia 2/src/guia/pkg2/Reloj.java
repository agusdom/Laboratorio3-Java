
package guia.pkg2;

public class Reloj {
    
    private int hora; 
    private int minutos;
    private int segundos;

    public Reloj(int hora, int minutos, int segundos) {
        this.hora =(hora>=0 && hora<24) ? hora : 0;
        this.minutos =(minutos>=0 && minutos<60) ? minutos:0;
        this.segundos = (segundos>=0 && segundos<24) ? segundos:0;
    }
    
    private void aumentohora(){
         if(this.hora==23)
         {
             this.hora=0;
         }
         else
         {
             this.hora++;
         }
    }
    
      private void aumentominutos(){
         if(this.minutos==59)
         {
             this.minutos=0;
             aumentohora();
         }
         else
         {
             this.minutos++;
         }
        
    }
     
         public Reloj aumentosegundos(){
         if(this.segundos==59)
         {
             this.segundos=0;
             aumentominutos();
         }
         else
         {
             this.segundos++;
         }
        return this;
    }
     
    
            private void restohora(){
         if(this.hora==0)
         {
             this.hora=23;
         }
         else
         {
             this.hora--;
         }
    }
    
      private void restominutos(){
        if(this.minutos==0)
         {
             this.minutos=59;
             restohora();
         }
         else
         {
             this.minutos--;
         }
        
    }
     
         public Reloj restosegundos(){
         if(this.segundos==0)
         {
             this.segundos=59;
             restominutos();
         }
         else
         {
             this.segundos--;
         }
        return this;
    }

    @Override
    public String toString() {
         String hh=String.format("%02d", hora);
         String mm=String.format("%02d", minutos);
         String ss=String.format("%02d", segundos);
         
         return hh+":"+mm+":"+ss;
    }
         
         
}
