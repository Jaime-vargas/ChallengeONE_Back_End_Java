/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.objects;

/**
 *
 * @author jaime
 */
public class Degrees extends Units{

    public Degrees(String key, String name) {
        super(key, name);
    }
    
    @Override
    public double doConversion(double userInput, Units val1){
        
        if(this.key.equals("C") &&  val1.key.equals("F")){
            double result = (userInput * 9/5) + 32;
            return result;
        } 
        else if (this.key.equals("F") && val1.key.equals("C")){
            double result = (userInput - 32) * 5/9;
            return result;
        }
        return userInput;
    }
    
    @Override
    public double getValue(){
        return 1f;
    } 
}

