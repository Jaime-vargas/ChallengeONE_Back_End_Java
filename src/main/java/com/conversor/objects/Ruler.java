/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.objects;

/**
 *
 * @author jaime
 */
public class Ruler extends Units{
    private final double value;

    public Ruler(String key, String name, double value) {
        super(key, name);
        this.value = value;
    }
    @Override
    public double getValue() {
        return this.value;
    } 
    @Override
    public double doConversion(double userInput, Units object){
 
         double result = userInput * (this.value / object.getValue());
         if (result > 1){
            double resultRound = Math.round(result);
            return resultRound;
        }
 
         return result;
         
        
       
       
    }
}

