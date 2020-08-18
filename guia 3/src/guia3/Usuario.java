package guia3;

import java.util.UUID;

public class Usuario {

    private UUID id;
    private String nombre;
    private char sexo;

    public Usuario(String nombre, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + '}';
    }
    
    

}
