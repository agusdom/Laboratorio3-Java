package excepciones.y.pkgenum;

import java.util.*;
import java.lang.*;

public class Cliente {

    private String nombre;
    private String dni;
    private int id;

    public Cliente(String nombre, String dni, int id) {
        this.nombre = nombre;
        this.dni = dni;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, dni, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cliente cliente = (Cliente) obj;
        return Objects.equals(nombre, cliente.nombre)
                && Objects.equals(dni, cliente.dni)
                && Objects.equals(id, cliente.id);
    }

}
