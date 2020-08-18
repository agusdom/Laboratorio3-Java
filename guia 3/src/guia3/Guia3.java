package guia3;

public class Guia3 {

    public static void main(String[] args) {
        
        /*Autor autorJoshua= new Autor("Joshua", "Bloch", "Joshua@email.com", 'M');
        System.out.println("Nombre del autor:" + autorJoshua.getNombre());
        System.out.println("Apellido del autor:" + autorJoshua.getApellido());
        System.out.println("Email del autor:" + autorJoshua.getEmail());
        System.out.println("Sexo del autor:" + autorJoshua.getSexo());
        
         Autor[] autores = new Autor[2];
        autores[0] = autorJoshua;
        
        Libro l = new Libro("Effectice java",autores, 450.0, 150);
        System.out.println("Titulo:" + l.getTitulo());
        System.out.println("Stock:" + l.getStock() +" "+"copias");
        System.out.println("Precio:" + l.getPrecio() +" "+ "Pesos");
        l.setPrecio(500);
        System.out.println("Nuevo precio:" + l.getPrecio() +" "+ "Pesos");
        l.setStock(200);
        System.out.println("Nuevo stock:" + l.getStock() +" "+"copias");
           
       Autor JC = new Autor("Juan", "chan", "JChan@email.com", 'M');
        System.out.println(JC);

        autores[1] = JC;

        Libro eJavaH = new Libro("Effective Java", autores,500.0, 150);
        System.out.println(eJavaH);

        System.out.println(eJavaH.getAutor());
        System.out.println(eJavaH.Vermensaje());
        System.out.println(eJavaH.Mostrarporpantalla());*/
         

        Cliente clientela = new Cliente("Agustin", "agustin95@hotmail.com", 30);
        ItemVenta itemventa1 = new ItemVenta("Lapiz", "Lapiz numero 3", 10, 100);
        ItemVenta itemventa2 = new ItemVenta("Hojas Canzon", "Hojas Canzon numero 5", 20, 15);
        ItemVenta itemventa3 = new ItemVenta("Goma", "Goma marca dos banderas", 8, 150);
        ItemVenta itemventa4 = new ItemVenta("Block de hojas", "Block el nene", 50, 4);
        ItemVenta itemventa5 = new ItemVenta("Acrilicos", "Caballo loco", 160, 7);

        ItemVenta[] items = new ItemVenta[5];
        items[0] = itemventa1;
        items[1] = itemventa2;
        items[2] = itemventa3;
        items[3] = itemventa4;
        items[4] = itemventa5;
        
        Factura modelo = new Factura(items,clientela);
        System.out.println(modelo);
        
         

        /*Usuario cliente = new Usuario("Agustin Dominguez", 'M');
        Cuenta cuentita = new Cuenta(cliente, 10000);
        System.out.println(cuentita);

        System.out.println("Deposito(500)" + "Balance=" + cuentita.depositar(500));
        System.out.println("Retiro(300)" + "Balance=" + cuentita.retiro(300));
        System.out.println("Deposito(250.5)" + "Balance=" + cuentita.depositar(250.5));
        System.out.println("Retiro(1000.75)" + "Balance=" + cuentita.retiro(1000.75));
        System.out.println("Deposito(800.6)" + "Balance=" + cuentita.depositar(800.6));
        System.out.println("Retiro(150.12)" + "Balance=" + cuentita.retiro(150.12));

        System.out.println("Operaciones realizadas");
        for (String ops : cuentita.getOperaciones()) {
            if (ops != null) {
                System.out.println(ops);
            }
        }*/
    }

}
