package com.company.vajilla;

public abstract class Vajilla {

  private String nombre;

  public Vajilla(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }
}
