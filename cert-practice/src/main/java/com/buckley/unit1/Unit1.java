// Package names are lowercase
package com.buckley.unit1;


/**
 * Unit1
 * 
 * Concepts: Variables, Classes, Packages
 */
public class Unit1 {
  /**
   * The default constructor is only package-accessible, so a public constructor
   * must be declared for this to be accessible outside the package
   */
  public Unit1() {}

  public void run() {
    // Variables
    System.out.println("** Variables.java **");
    Variables variables = new Variables();
    variables.localVariables();
    variables.methodWithParams("This is a parameter passed into a method");
    System.out.println(Variables.STATIC_FINAL_FIELD + "\n");
  }
}