package com.company;

import com.company.empleado.EmpleadoLimpieza;

import java.util.ArrayList;

public class Restaurante {

  private String nombre;
  private ArrayList<EmpleadoLimpieza> empleadosDeLimpieza;

  public Restaurante(String nombre) {
    this.nombre = nombre;
    this.empleadosDeLimpieza = new ArrayList<EmpleadoLimpieza>();
  }

  public void agregarEmpleados(EmpleadoLimpieza unEmpleado){
    this.empleadosDeLimpieza.add(unEmpleado);
  }

  public void informarSueldosEmpleados(){
    for (EmpleadoLimpieza empleadoLimpieza : empleadosDeLimpieza) {
      System.out.println("El empleado " + empleadoLimpieza.getApellido() + " cobra " + empleadoLimpieza.informarSueldo() + " frijoles mágicos");
    }
  }


}
