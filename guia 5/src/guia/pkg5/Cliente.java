package guia.pkg5;

import java.util.Objects;

public class Cliente {

    private int idCliente;
    private String Nombre;
    private int dni;

    public Cliente(int idCliente, String Nombre, int dni) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.dni = dni;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCliente, Nombre, dni);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente)
                && Objects.equals(Nombre, cliente.Nombre)
                && Objects.equals(dni, cliente.dni);
    }

}
