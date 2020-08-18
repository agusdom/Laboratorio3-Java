package guia3;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private Autor[] autores;
    private double precio;
    private int stock;

    public Libro(String titulo, Autor[] autor, double precio, int stock) {
        this.titulo = titulo;
        this.stock = stock;
        this.precio = precio;
        this.autores = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int p) {
        this.precio = p;

    }

    public void setStock(int s) {
        this.stock = s;
    }

    public Autor[] getAutor() {
        return autores;
    }

      public String Mostrarporpantalla(){
           Autor nombreyapellido=new Autor("Joshua", "Bloch", "Joshua@email.com", 'M');
        for(Autor autorr: autores){
            if(autorr!=null){
                System.out.println("Nombre:" +autorr.nombre);
       
                  System.out.println("Apellido:" +autorr.apellido);
                
               
              }
        }    
       return "El libro"+" "+this.titulo+" "+"de"+" "+nombreyapellido.nombre+" "+nombreyapellido.apellido+" "+",Se vende a"+" "+this.precio+"pesos";     
        
    }
    public String Vermensaje(){
        StringBuilder nombres= new StringBuilder();
        for(Autor autorr: autores)
        {
           if(autorr!=null)
           {
               nombres.append(autorr.getNombre());
               nombres.append(" ");
               nombres.append(autorr.getApellido());
               nombres.append(" ");
           }
        }
        return "El libro"+" "+this.titulo+" "+nombres+",Se vende a"+" "+this.precio+" "+"pesos";
    }
 

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autores=" + Arrays.toString(autores)+ ", precio=" + precio + ", stock=" + stock + '}';
    }

    

}
