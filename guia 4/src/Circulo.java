public class Circulo {
    
   private  double radio;
   private String color;

    public Circulo(){
    
}
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }
    
    public double getArea(){
        return Math.PI*(radio*radio);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    }


