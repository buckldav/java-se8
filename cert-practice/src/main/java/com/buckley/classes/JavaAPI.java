package com.buckley.classes;

/**
 * JavaAPI
 */
public class JavaAPI {
  
  public JavaAPI() {
    System.out.println("\n*** JavaAPI ***");
  }

  // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
  public void stringBuilder() {
    StringBuilder sb = new StringBuilder();
    sb.append("using a stringbuilder see if we aight");
    sb.append(" here's some more stuff");
    sb.append(" yada yada yada");
    System.out.println(sb.toString());
    System.out.println("Index of stringbuilder: " + sb.indexOf("stringbuilder"));
    System.out.println("Index of not found: " + sb.indexOf("not found"));
    System.out.print("Insert 'nother' at index 7: ");
    sb.insert(7, "nother");
    System.out.println(sb.toString());
    System.out.print("Replace 'nother' at index 7 with '': ");
    sb.replace(sb.indexOf("nother"), sb.lastIndexOf("nother"), "");
    System.out.println(sb.toString());
    System.out.println("reverse() " + sb.reverse().toString());
    System.out.println("substring 0 to 5: " + sb.substring(0, 5));
  }

}