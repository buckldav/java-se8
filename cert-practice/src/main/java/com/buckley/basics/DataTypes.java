package com.buckley.basics;

/**
 * DataTypes
 */
public class DataTypes {

  public DataTypes() {}

  public void primitiveTypes() {
    Class types[] = {byte.class, short.class, int.class, long.class, float.class, double.class, boolean.class, char.class};
    Integer bits[] = {Byte.SIZE, Short.SIZE, Integer.SIZE, Long.SIZE, Float.SIZE, Double.SIZE, Short.SIZE, Character.SIZE};
    System.out.println("\n*** Primitive Data Types ***");
    for (int i = 0; i < types.length; i++) {
      if (i == types.length - 1) {
        System.out.println(types[i] + " " + bits[i]);
      } else {
        System.out.print(types[i] + " " + bits[i] + ", ");
      }
    }
  }

  public void arrays() {
    System.out.println("\n*** Arrays ***");

    // One dimensional arrays
    String strings[] = new String[3];
    for (int i = 0; i < strings.length; i++) {
      strings[i] = "Hello";
    }

    String words[] = {"1", "2", "3"};
    for (String s : words) {
      System.out.println(s);
    }

    // Two dimensional arrays

  }
}