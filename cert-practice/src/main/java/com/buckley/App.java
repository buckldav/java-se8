package com.buckley;
import com.buckley.basics.*;
import com.buckley.classes.*;
import com.buckley.exceptions.Exceptions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Exceptions
        new Exceptions().exceptions();

        // Basics
        new Variables().scopeAndMethods();
        DataTypes dt = new DataTypes();
        dt.primitiveTypes();
        dt.arrays();

        // Classes
        Inheritance inher = new Inheritance();
        inher.bicycles();
        JavaAPI javaAPI = new JavaAPI();
        javaAPI.stringBuilder();        
    }
}
