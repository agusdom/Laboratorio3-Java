
package guia3;

import java.util.UUID;

public class Cuenta {
    
    private static final int MAX_OPS = 10;
    private UUID id;
    private Usuario Cliente;
    private double balance;
    private int contador=0;
    private String operaciones[]= new String[MAX_OPS];

    public Cuenta(Usuario Cliente, double balance) {
        this.Cliente = Cliente;
        this.balance = balance;
        this.id=UUID.randomUUID();
    }

    public static int getMAX_OPS() {
        return MAX_OPS;
    }

    public UUID getId() {
        return id;
    }

    public Usuario getCliente() {
        return Cliente;
    }

    public double getBalance() {
        return balance;
    }

    public int getContador() {
        return contador;
    }

    public String[] getOperaciones() {
        return operaciones;
    }
    
    public double depositar(double monto){
        
        documentarDeposito(monto);
        return this.balance;
      }
    
    public void documentarDeposito(double monto){
        if(this.contador==MAX_OPS)
        {
            this.contador=0;
        }
        operaciones[contador]="El titular:"+ this.Cliente +" "+"deposito:"+monto;
        this.contador++;
    }
    
        public void documentarRetiro(double monto){
        if(this.contador==10)
        {
            this.contador=0;
        }
        operaciones[contador]="El titular:"+ this.Cliente +" "+"retiro:"+monto;
        this.contador++;
    }
         
        public double retiro(double monto){
            double tempBalance=this.balance-monto;
            if(tempBalance>=-2000)
            {
                System.out.println("Monto insuficiente");
            }
            else
            {
                this.balance -=monto;
                documentarRetiro(monto); 
            }
            return this.balance;
        }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", Cliente=" + Cliente + ", balance=" + balance + '}';
    }
    
  
    
}
