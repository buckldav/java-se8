package com.buckley.unit1;

/**
 * Variables
 * 
 * Herein are examples of fields, local variables, and parameters
 * 
 * ACCESS MODIFIERS
 * Default: Accessible to the classes in the same package only.
 * Public. Can be accessed from anywhere.
 * Private. Accessible only inside the same class.
 * Protected. Accessible only to the classes in the same package and to the subclasses.
 * 
 * NAMING
 * For variables, camelCase
 * For constants, UPPERCASE_WITH_UNDERSCORES
 * Begin variables with a letter, not a $ or _
 */
class Variables 
{
  private String field;
  static final String STATIC_FINAL_FIELD = "This is a static field";

  Variables() {
    field = "This is a field, aka a variable";
  }

  void localVariables() {
    System.out.println(field);
    String local = "This is a local variable";
    System.out.println(local);
  }

  void methodWithParams(String param1) {
    // local int not accessible here
    System.out.println(param1);
  }
    
}