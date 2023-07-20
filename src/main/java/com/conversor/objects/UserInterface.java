/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.objects;

import javax.swing.JLabel;

/**
 *
 * @author jaime
 */
public class UserInterface {

    public static void changeOFTittle(Buttons button, JLabel tittle){
        tittle.setText(button.getTittle());
    }
    
}
