package com.buckley.exceptions;

/**
 * Exceptions
 */
public class Exceptions {

  public Exceptions() {}

  private void throwsAnNP() throws NullPointerException {
    Integer nothing = 10;
    if (nothing > 5) {
      nothing = null;
    }
    System.out.println(nothing.toString());
  }

  public void exceptions() {
    System.out.println("\n*** Exceptions ***");

    // NullPointerException
    try {
      throwsAnNP();
    } catch (Exception e) {
      e.printStackTrace();
    }

    // ArithmeticException
    try {
      Integer illegal = 1 / 0;
      System.out.println(illegal);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // ArrayIndexOutOfBoundsException
    try {
      int numbas[] = {1, 2, 3};
      for (int i = 0; i <= numbas.length; i++) {
        numbas[i] += 2; 
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    // ClassCastException
    try {
      Object obj = Integer.valueOf(10);
      System.out.println((String) obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}