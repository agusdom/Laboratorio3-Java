package guia.pkg2;

public class Banco {

    private int id;
    private String nombre;
    private int balance;

    public Banco(int id, String nombre, int balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBalance() {
        return balance;
    }

    public int credito(int monto) {

        return this.balance + monto;
    }
    
        public int deposito(int monto) {

            
            if(this.balance<monto)
            {
              System.out.println("El monto es insuficiente para realizar este deposito");  
            }
            else
            {
               this.balance=balance - monto;
            }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Banco{" + "id=" + id + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
        
        

}
