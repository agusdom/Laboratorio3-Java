
package guia.pkg2;


public class Rectangulo {
    
    private double ancho=1.0;
    private double alto=1.0;

    public Rectangulo(double ancho,double alto) {
        this.alto=alto;
        this.ancho=ancho;
    }

    public Rectangulo() {
    }

    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double Area(){
        
        return (ancho*alto);
    }
    
     public double Perimetro(){
        
        return (2*(ancho*alto));
    }
    
    
    
    
    
}
