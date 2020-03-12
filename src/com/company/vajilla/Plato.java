package com.company.vajilla;

import com.company.Rompible;

public class Plato extends Vajilla implements Rompible {

  public Plato(String nombre) {
    super(nombre);
  }

  @Override
  public void romper() {
    System.out.println("uy, acabo de romper un plato");
  }
}
