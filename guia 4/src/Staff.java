
public class Staff extends Persona {

     double salario;
    char turno;

    public Staff(double salario, char turno, String nombre, String apellido, int Dni, String email, String direccion) {
        super(nombre, apellido, Dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
    
        public double setSalarioanual(double salario) {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Staff{" + "salario=" + salario + ", turno=" + turno + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", email=" + email + ", direccion=" + direccion +'}';
    }
    
    

}
