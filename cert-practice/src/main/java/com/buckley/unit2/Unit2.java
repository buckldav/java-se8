package com.buckley.unit2;

/**
 * Unit2
 */
public class Unit2 {

  public Unit2() {}

  public void run() {
    // Data Types
    System.out.println("** DataTypes.java **");
    DataTypes dataTypes = new DataTypes();
    dataTypes.primitiveTypes();

    // Classes, Inheritance
    System.out.println("** Bicycle.java, MountainBike.java **");
    Bicycle bicycle = new Bicycle(10, 1, 1);
    MountainBike mountainBike = new MountainBike(10, 1, 1, 1);
    System.out.println(bicycle.toString());
    System.out.println(mountainBike.toString());
  }
}