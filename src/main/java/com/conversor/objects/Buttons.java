/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author jaime
 */
public class Buttons {
    
    private JButton button;
    private ImageIcon icon;
    private ImageIcon iconSelected;
    private String tittle;

    public Buttons(JButton button, ImageIcon icon, ImageIcon iconSelected, String tittle){
        this.button = button;
        this.icon = icon;
        this.iconSelected = iconSelected;
        this.tittle = tittle;
    }
        
    public JButton getButton() {
        return button;
    }
    
    public void nonSelectedIcon(){
        button.setIcon(icon);
    }
    
    public void SelectedIcon(){
        button.setIcon(iconSelected);
    }
    public String getTittle() {
        return tittle;
    }
     
    
    
    
    
    
}
