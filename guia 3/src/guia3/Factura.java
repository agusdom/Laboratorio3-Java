package guia3;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Factura {

    private double MontoT;
    private ItemVenta[] items;
    private LocalDateTime Fecha;
    private UUID Id;
    private Cliente Cliente;

    public Factura(ItemVenta[] items, Cliente Cliente) {
        this.MontoT = MontoT;
        this.Id = UUID.randomUUID();
        this.Cliente = Cliente;
        this.Fecha = LocalDateTime.now();

    }


    public double getMontoT() {
        return MontoT;
    }

    public ItemVenta[] getItemVenta() {
        return items;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public UUID getId() {
        return Id;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public double getMontoTotal() {

        double total = 0.0;
        for (ItemVenta iv: items ) {
            if(iv!=null){
                total += iv.getTotal();
                
                
            }

        }
        return total - (total*(Cliente.getDescuento()/100));
    }

    @Override
    public String toString() {
        return "Factura{" + "MontoT=" + this.MontoT + ", items=" + Arrays.toString(items) + ", Fecha=" + Fecha + ", Id=" + Id + ", Cliente=" + Cliente + '}';
    }
    
    

}
