
package guia3;

import java.util.UUID;

class ItemVenta {
    private  UUID Id;
    private double precioUnitario;
    private double Total;
    private int cantidad;
    private String nombre;
    private String descripcion;

    public ItemVenta( String nombre, String descripcion,double precioUnitario, int cantidad) {
        this.Id = UUID.randomUUID() ;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return Id;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getTotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta{" + "Id=" + Id + ", precioUnitario=" + precioUnitario + ", Total=" + Total + ", cantidad=" + cantidad + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    

}


    
  

