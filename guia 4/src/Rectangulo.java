
public class Rectangulo extends Figurilla {
    
   protected double base;
   protected double altura;

   public Rectangulo(){
   this.base=2.0;
   this.altura=1.0;
   }       

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
   
public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + "color=" + color + '}';
    }
    
    

    @Override
    public double Area() {
       return base * altura;
       
    }

    public double Perimetro() {
      return (2*base) + (2*altura);
    
    }
    
}
