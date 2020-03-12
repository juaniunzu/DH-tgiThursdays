package com.company.empleado;

public abstract class EmpleadoLimpieza {

  protected String nombre;
  protected String apellido;
  protected String dni;
  protected Double sueldo;

  public EmpleadoLimpieza(String nombre, String apellido, String dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.sueldo = 20000.0;
  }

  public Double informarSueldo(){
    //todo
    return 0.0;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getDni() {
    return dni;
  }

  public Double getSueldo() {
    return sueldo;
  }
}
