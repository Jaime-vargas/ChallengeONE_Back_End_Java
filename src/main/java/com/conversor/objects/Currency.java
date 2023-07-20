/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.objects;

/**
 *
 * @author jaime
 */
public class Currency extends Units{
    private final double value;

    public Currency(String key, String name, Float value) {
        super(key, name);
        this.value = value;
    }
    @Override
    public double getValue() {
        return this.value;
    } 
    @Override
    public double doConversion(double userInput, Units object){
         double result = userInput * object.getValue() / this.value;
         return result;
    }
}

