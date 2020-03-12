package com.company.vajilla;

import com.company.Rompible;

public class Taza extends Vajilla implements Rompible {

  public Taza(String nombre) {
    super(nombre);
  }

  @Override
  public void romper() {
    System.out.println("uy, acabo de romper una taza");
  }
}
