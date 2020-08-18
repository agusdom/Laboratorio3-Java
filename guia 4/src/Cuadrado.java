
public class Cuadrado extends Rectangulo {

    public Cuadrado() {
        super(1.0,1.0);
    }
    
    
    
    public Cuadrado(double lado, String color) {
        super(lado, lado, color);
    }
    
        @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + "color=" + color + '}';
    }
    
    
}
