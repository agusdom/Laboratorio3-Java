
import java.util.Arrays;

public class Cilindro extends Circulo {

   private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Cilindro:subclase de" + " " + super.toString() + ',' + "altura=" + altura;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * altura) + (2 * super.getArea());
    }

    public double getVolumen() {

        return super.getArea()*this.altura;
    }
}
