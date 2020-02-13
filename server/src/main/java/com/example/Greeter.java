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
    Long lalala = new Long("2333");
    if(magico > 1){
      if(true){
         if(true){
         if(true){
        System.out.println("Hola caracola");
      }
      }
      }
        return String.format("Hello, %s!", someone);
    }
     else{
        return String.format("Hello, %s!", someone);
    }
  }
}
