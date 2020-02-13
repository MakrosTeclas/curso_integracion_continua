package com.example;

/**
 * This is a class.
 */
public class Greeter {
  public Long magico = new Long("2333");

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Metodo de greet modificado.
   */
  public String greet(String someone) {
    // Long lalala = new Long("2333");
    if (magico > 1) {
        return String.format("Hello, %s!", someone.toUperCase());
    } else {
        return String.format("Hello, %s!", someone);
    }
  }
}
