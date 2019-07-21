package com.buckley.unit2;

/**
 * DataTypes
 */
public class DataTypes {

  void primitiveTypes() {
    Class types[] = {byte.class, short.class, int.class, long.class, float.class, double.class, boolean.class, char.class};
    Integer bits[] = {Byte.SIZE, Short.SIZE, Integer.SIZE, Long.SIZE, Float.SIZE, Double.SIZE, Short.SIZE, Character.SIZE};
    System.out.println("Primitive Data Types");
    for (int i = 0; i < types.length; i++) {
      if (i == types.length - 1) {
        System.out.println(types[i] + " " + bits[i]);
      } else {
        System.out.print(types[i] + " " + bits[i] + ", ");
      }
    }
  }
}