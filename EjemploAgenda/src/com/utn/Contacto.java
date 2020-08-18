package com.utn;

public class Contacto {

  private String nombre;
  private String apellido;

  public Contacto(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contacto contacto = (Contacto) o;
    return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido);
  }

  @Override
  public int hashCode() {
    int result = nombre.hashCode();
    result = 31 * result + apellido.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Contacto{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + '}';
  }
}
