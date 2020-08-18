
public class Persona {

    protected String nombre;
    protected String apellido;
    protected int Dni;
    protected String email;
    protected String direccion;

    public Persona(String nombre, String apellido, int Dni, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return Dni;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", email=" + email + ", direccion=" + direccion + '}';
    }

}
