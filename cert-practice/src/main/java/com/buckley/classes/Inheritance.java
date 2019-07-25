package com.buckley.classes;

/**
 * Inheritance
 */
public class Inheritance {

  public Inheritance() {}

  public void bicycles() {
    // Classes, Inheritance
    System.out.println("\n*** Bicycle.java, MountainBike.java ***");
    Bicycle bicycle = new Bicycle(10, 1, 1);
    MountainBike mountainBike = new MountainBike(10, 1, 1, 1);
    System.out.println(bicycle.toString());
    System.out.println(mountainBike.toString());
  }
}