
public class Circulito extends Figurilla {

    private double radio = 1.0;

    public Circulito(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulito{" + "radio=" + radio + "," + "color=" + color +'}';
    }


    
   @Override
    public double Area() {
        return Math.PI * (radio * radio);
    }

    public double Perimetro() {
        return (2 * Math.PI * radio);

    }
}
