public abstract class Figurilla {
    protected String color="azul";

    public Figurilla() {
    }
    
      public Figurilla(String color) {
          this.color=color;
    }

    public String getColor() {
        return color;
    }

 
    public abstract double Area();
    public abstract double Perimetro();
    
    @Override
    public String toString() {
        return "Figurilla{" + "color=" + color + '}';
    }
      
      
    
}
