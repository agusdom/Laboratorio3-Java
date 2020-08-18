
package guia.pkg2;

public class ItemsDeVenta {
    
    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public ItemsDeVenta(int id, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }
    
    public double PrecioTotal(){
        
        pTotal=pUnitario*cantidad;
        return pTotal;
    }

    @Override
    public String toString() {
        return "ItemsDeVenta{" + "id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", pUnitario=" + pUnitario + ", pTotal=" + this.PrecioTotal() + '}';
    }
    
    
    
}
