/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conversor.objects;

import java.util.Comparator;

/**
 *
 * @author jaime
 */
public abstract class Units{
         String key;
         String name;
         String fullName;
         
         public Units(String key, String name) {
        this.key = key;
        this.name = name;
        this.fullName = key + " - " + name;
    }
         
         public abstract double doConversion(double userInput, Units val1);
          
         public abstract double getValue() ;

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }
         
         
}
