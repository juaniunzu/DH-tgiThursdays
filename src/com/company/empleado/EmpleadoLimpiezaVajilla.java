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
    unRompible.romper();
    this.vajillaRota.add(unRompible);
  }

  private Integer descuentoPorRomper(){
    int descuentoPorRomper = 0;
    descuentoPorRomper = vajillaRota.size() * 5;
    return descuentoPorRomper;
  }


  @Override
  public Double informarSueldo() {
    Double sueldoACobrarConDescuento = 0.0;
    sueldoACobrarConDescuento = this.sueldo - descuentoPorRomper();
    return sueldoACobrarConDescuento;

  }
}
