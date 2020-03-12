package com.company.vajilla;

import com.company.Rompible;

public class Vaso extends Vajilla implements Rompible {

  public Vaso(String nombre) {
    super(nombre);
  }

  @Override
  public void romper() {
    System.out.println("uy, acabo de romper un vaso");
  }
}
