package com.company.empleado;

import com.company.Rompible;
import com.company.empleado.EmpleadoLimpieza;

import java.util.ArrayList;

public class EmpleadoLimpiezaVajilla extends EmpleadoLimpieza {

  private ArrayList<Rompible> vajillaRota;

  public EmpleadoLimpiezaVajilla(String nombre, String apellido, String dni) {
    super(nombre, apellido, dni);
    this.vajillaRota = new ArrayList<Rompible>();
  }

  public void romperVajilla(Rompible unRompible){
    //todo
  }

  @Override
  public Double informarSueldo() {
    //todo
    return 0.0;
  }
}
