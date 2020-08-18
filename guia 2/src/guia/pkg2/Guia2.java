package guia.pkg2;

public class Guia2 {

    public static void main(String[] args) {

        /*Rectangulo rectangulo = new Rectangulo();
        System.out.println("Alto=" + rectangulo.getAlto());
        System.out.println("Ancho=" + rectangulo.getAncho());
        System.out.println("Area=" + rectangulo.Area());
        System.out.println("Perimetro=" + rectangulo.Perimetro());

        rectangulo.setAlto(2.0);
        rectangulo.setAncho(3.0);
        System.out.println("Nueva area=" + rectangulo.Area());
        System.out.println("Nuevo perimetro=" + rectangulo.Perimetro());

        Rectangulo rectangulo2 = new Rectangulo();
        System.out.println("Alto por defecto=" + rectangulo2.getAlto());
        System.out.println("Ancho por defecto=" + rectangulo2.getAncho());
        System.out.println("Area con valores por defecto=" + rectangulo2.Area());
        System.out.println("Perimetro con valores por defecto=" + rectangulo2.Perimetro());
        
        Empleado hombre=new Empleado(23456345,"Carlos","Gutiérrez",25000);
        System.out.println(hombre); 
        System.out.println("Salario anual=" +hombre.SalarioAnual());
        System.out.println("El salario anual de Carlos con un aumento del 15% es=" +hombre.SalarioConAumento(15));
        Empleado mujer=new Empleado(34234123,"Ana","Sánchez",27500);
        System.out.println(mujer);
        System.out.println("Salario anual=" +mujer.SalarioAnual());
        
        ItemsDeVenta compras=new ItemsDeVenta(1,"arroz",5,8.5);
        System.out.println(compras);
        ItemsDeVenta compras2=new ItemsDeVenta(2,"leche",10,11.9);
        System.out.println(compras2);
        ItemsDeVenta compras3=new ItemsDeVenta(3,"fernet",2,220);
        System.out.println(compras3);
        
        Banco usuario=new Banco(1,"agustin dominguez",15000);
        System.out.println("Se realizo un credito de $2500,el balance queda con=$" +usuario.credito(2500));
        System.out.println("Se realizo un deposito de $1500,el balance queda con=$ " +usuario.deposito(1500));
        System.out.println("El balance queda con=$" +usuario.deposito(30000));
        System.out.println(usuario);
        */
        
        Reloj hora=new Reloj(23,00,00);
        System.out.println(hora);
        hora.aumentosegundos();
        System.out.println(hora);
        hora.restosegundos();
        System.out.println(hora);
       
    }

}
