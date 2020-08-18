package guia3;


public class Autor {

    protected String nombre;
    protected String apellido;
    protected String email;
    protected char sexo;

    public Autor(String nombre, String apellido, String email, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sexo = sexo;

    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", sexo=" + sexo + '}';
    }
    
   
}
