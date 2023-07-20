/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.conversor.app;

import com.conversor.api.APIConnections;
import static com.conversor.app.Util.*;
import static com.conversor.objects.UserInterface.*;
import com.conversor.objects.Buttons;
import com.conversor.objects.Units;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.Border;
import org.json.JSONObject;

/**
 *
 * @author jaime
 */
public class Application extends javax.swing.JFrame {
    
    /**
     * Creates new form Application
     */
    
    //This Json objects are for start a connection to an API an save response in a JSON file
    JSONObject jsonCurrencies = APIConnections.getCurrencies();
    JSONObject jsonValues = APIConnections.getValues();
    //This list is for save an organize the values of json Files
    List<Units> CurrenciesArray = sortArrayList(  jsonCurrencies, jsonValues);
    List<Units> DegreesArray = fillDegreesArrayList();
    List<Units> RulerArray = fillRulerArrayList();
    List<Units> BytesArray = fillBytesArrayList();
    //List of buttons
    List<Buttons> buttonList = new ArrayList<>();
    
    
    //Look and feel
    
    Border defaultBorder = UIManager.getBorder("TextField.border");
    Border redBorder = BorderFactory.createLineBorder(Color.RED, 1);   
    
    List<Units> activeList = CurrenciesArray;
  
// code 
    
    public Application() {
        initComponents();
        setIconImage(IconImage());
        fillButtons(buttonList, currencyButton, farenheitButton, rulerButton, byteButton, changeCurrencyPosition);
        fillBoxes(activeList, Box1, Box2);
        Box1.setSelectedIndex(96); 
        StateOfButtons(currencyButton);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        currencyButton = new javax.swing.JButton();
        farenheitButton = new javax.swing.JButton();
        rulerButton = new javax.swing.JButton();
        byteButton = new javax.swing.JButton();
        CurrenciesPanel = new javax.swing.JPanel();
        importLbl = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        toLbl = new javax.swing.JLabel();
        dataFromInput = new javax.swing.JLabel();
        calculatedLbl = new javax.swing.JLabel();
        boxValue1 = new javax.swing.JLabel();
        boxValue2 = new javax.swing.JLabel();
        errorLbl = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        Box1 = new javax.swing.JComboBox<>();
        changeCurrencyPosition = new javax.swing.JButton();
        Box2 = new javax.swing.JComboBox<>();
        doConversion = new javax.swing.JButton();
        challengueOne = new javax.swing.JLabel();
        backEnd = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        developedByLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Challengue ONE - Back-End Java");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setPreferredSize(new java.awt.Dimension(1200, 550));
        Bg.setRequestFocusEnabled(false);
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currencyButton.setBorderPainted(false);
        currencyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currencyButton.setPreferredSize(new java.awt.Dimension(35, 35));
        currencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyButtonActionPerformed(evt);
            }
        });
        Bg.add(currencyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 15, -1, -1));

        farenheitButton.setBorderPainted(false);
        farenheitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        farenheitButton.setPreferredSize(new java.awt.Dimension(35, 35));
        farenheitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farenheitButtonActionPerformed(evt);
            }
        });
        Bg.add(farenheitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 15, -1, -1));

        rulerButton.setBorderPainted(false);
        rulerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rulerButton.setPreferredSize(new java.awt.Dimension(35, 35));
        rulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulerButtonActionPerformed(evt);
            }
        });
        Bg.add(rulerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 15, -1, -1));

        byteButton.setBorderPainted(false);
        byteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        byteButton.setPreferredSize(new java.awt.Dimension(35, 35));
        byteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byteButtonActionPerformed(evt);
            }
        });
        Bg.add(byteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 15, -1, -1));

        CurrenciesPanel.setBackground(new java.awt.Color(255, 255, 255));
        CurrenciesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        importLbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        importLbl.setText("Cantidad");
        CurrenciesPanel.add(importLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        fromLbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        fromLbl.setText("De:");
        CurrenciesPanel.add(fromLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        toLbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        toLbl.setText("a");
        CurrenciesPanel.add(toLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        dataFromInput.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        dataFromInput.setForeground(new java.awt.Color(102, 102, 102));
        dataFromInput.setText("float currencyName = ");
        CurrenciesPanel.add(dataFromInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 600, -1));

        calculatedLbl.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        calculatedLbl.setText("float currencyName");
        CurrenciesPanel.add(calculatedLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 1000, -1));

        boxValue1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        boxValue1.setForeground(new java.awt.Color(102, 102, 102));
        boxValue1.setText("1 USD = 17,0594 MXN");
        CurrenciesPanel.add(boxValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 500, -1));

        boxValue2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        boxValue2.setForeground(new java.awt.Color(102, 102, 102));
        boxValue2.setText("1 MXN = 0,0586189 USD");
        CurrenciesPanel.add(boxValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 325, 500, -1));

        errorLbl.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        errorLbl.setForeground(new java.awt.Color(255, 51, 51));
        errorLbl.setPreferredSize(new java.awt.Dimension(300, 15));
        CurrenciesPanel.add(errorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 435, -1, -1));

        Input.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Input.setText("1");
        Input.setPreferredSize(new java.awt.Dimension(250, 50));
        Input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                InputInputMethodTextChanged(evt);
            }
        });
        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });
        Input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputKeyTyped(evt);
            }
        });
        CurrenciesPanel.add(Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 125, -1, -1));

        Box1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        Box1.setPreferredSize(new java.awt.Dimension(300, 50));
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });
        CurrenciesPanel.add(Box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 125, -1, -1));

        changeCurrencyPosition.setBorderPainted(false);
        changeCurrencyPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeCurrencyPosition.setPreferredSize(new java.awt.Dimension(50, 50));
        changeCurrencyPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCurrencyPositionActionPerformed(evt);
            }
        });
        CurrenciesPanel.add(changeCurrencyPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 125, -1, -1));

        Box2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        Box2.setPreferredSize(new java.awt.Dimension(300, 50));
        Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ActionPerformed(evt);
            }
        });
        CurrenciesPanel.add(Box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 125, -1, -1));

        doConversion.setBackground(new java.awt.Color(42, 120, 226));
        doConversion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        doConversion.setForeground(new java.awt.Color(255, 255, 255));
        doConversion.setText("Realizar conversión");
        doConversion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doConversion.setPreferredSize(new java.awt.Dimension(250, 50));
        doConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doConversionActionPerformed(evt);
            }
        });
        CurrenciesPanel.add(doConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, -1, -1));

        challengueOne.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        challengueOne.setForeground(new java.awt.Color(51, 51, 51));
        challengueOne.setText("Challengue ONE");
        CurrenciesPanel.add(challengueOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        backEnd.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        backEnd.setForeground(new java.awt.Color(0, 102, 51));
        backEnd.setText("Back - End Java ");
        backEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CurrenciesPanel.add(backEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, -1, -1));

        tittle.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        tittle.setText("Conversor de Monedas");
        CurrenciesPanel.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 25, -1, -1));

        developedByLbl.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        developedByLbl.setForeground(new java.awt.Color(102, 102, 102));
        developedByLbl.setText("Developed by Jaime Vargas");
        developedByLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        developedByLbl.setPreferredSize(new java.awt.Dimension(150, 15));
        developedByLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developedByLblMouseClicked(evt);
            }
        });
        CurrenciesPanel.add(developedByLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 435, -1, -1));

        Bg.add(CurrenciesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doConversionActionPerformed

        changueAllLabels(activeList);
    }//GEN-LAST:event_doConversionActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
         changueAllLabels(activeList);
    }//GEN-LAST:event_InputActionPerformed

    private void changeCurrencyPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCurrencyPositionActionPerformed
        int value1 = Box1.getSelectedIndex();
        int value2 = Box2.getSelectedIndex();
        Box1.setSelectedIndex(value2);
        Box2.setSelectedIndex(value1);
    }//GEN-LAST:event_changeCurrencyPositionActionPerformed

    public void changueAllLabels(List<Units> activeList){
        try{
            Units boxObject1 = activeList.get(Box1.getSelectedIndex());
            String keyBox1 = boxObject1.getKey();
            String nameBox1 = boxObject1.getName();

            
            Units boxObject2 = activeList.get(Box2.getSelectedIndex());
            String keyBox2 = boxObject2.getKey();
            String nameBox2 = boxObject2.getName();
                
            double valueFromInput = validateInput();

            double value1 = boxObject1.doConversion(1, boxObject2);
            double value2  = boxObject2.doConversion(1, boxObject1);
            double valueCalculated = boxObject1.doConversion(valueFromInput, boxObject2);
           
            String value1Formated = formatValues(value1);
            String value2Formated = formatValues(value2);
            String valueCalculatedFormated = formatValues(valueCalculated);
            
            dataFromInput.setText(valueFromInput + " " + nameBox1 + "  =");
            calculatedLbl.setText(valueCalculatedFormated + " "+ nameBox2);

            boxValue1.setText(1 + "  " + keyBox1 + " = " + value1Formated + "  " + keyBox2 );
            boxValue2.setText(1 + "  " + keyBox2 + " = " + value2Formated + "  " + keyBox1 );
        }catch(IndexOutOfBoundsException e){
        }
 
    }  
    
    
    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        changueAllLabels(activeList);  
    }//GEN-LAST:event_Box1ActionPerformed

    private void Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box2ActionPerformed
        changueAllLabels(activeList);  
    }//GEN-LAST:event_Box2ActionPerformed

    private void InputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_InputInputMethodTextChanged
       
    }//GEN-LAST:event_InputInputMethodTextChanged

    private void InputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputKeyTyped
       validateInput();
    }//GEN-LAST:event_InputKeyTyped

    private void currencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyButtonActionPerformed
        JButton clickedButton = (JButton) evt.getSource();
        StateOfButtons(clickedButton);
        fillBoxes(CurrenciesArray, Box1, Box2);
        activeList = CurrenciesArray;
        Box1.setSelectedIndex(96); 
    }//GEN-LAST:event_currencyButtonActionPerformed

    private void rulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulerButtonActionPerformed
        JButton clickedButton = (JButton) evt.getSource();
        StateOfButtons(clickedButton);
        fillBoxes(RulerArray, Box1, Box2);
        activeList = RulerArray;
        Box1.setSelectedIndex(3); 
    }//GEN-LAST:event_rulerButtonActionPerformed

    private void farenheitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farenheitButtonActionPerformed
        JButton clickedButton = (JButton) evt.getSource();
        StateOfButtons(clickedButton);
        fillBoxes(DegreesArray, Box1, Box2);
        activeList = DegreesArray;
        Box2.setSelectedIndex(1); 
    }//GEN-LAST:event_farenheitButtonActionPerformed

    private void byteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byteButtonActionPerformed
        JButton clickedButton = (JButton) evt.getSource();
        StateOfButtons(clickedButton);
        fillBoxes(BytesArray, Box1, Box2);
        activeList = BytesArray;
        Box1.setSelectedIndex(1);
    }//GEN-LAST:event_byteButtonActionPerformed

    private void developedByLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developedByLblMouseClicked
                About aboutFrame = new About();
                aboutFrame.setVisible(true);
    }//GEN-LAST:event_developedByLblMouseClicked
    
    public void StateOfButtons(JButton clickedButton){
        for(Buttons option : buttonList){
            if(option.getButton() == clickedButton){
                option.SelectedIcon();
                changeOFTittle(option, tittle);
            }else{
                option.nonSelectedIcon();
            }
        } 
    }
   
    
    public float validateInput(){
        String input = Input.getText();
        
       try {
            float number = Float.parseFloat(input);
            Input.setBorder(defaultBorder);
            errorLbl.setText("");
            return number;
            
            } catch (NumberFormatException ex) {
                
            Input.setBorder(redBorder);
            errorLbl.setText("Ingresa un valor valido");
            return 1;
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Application().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JComboBox<String> Box1;
    private javax.swing.JComboBox<String> Box2;
    private javax.swing.JPanel CurrenciesPanel;
    private javax.swing.JTextField Input;
    private javax.swing.JLabel backEnd;
    private javax.swing.JLabel boxValue1;
    private javax.swing.JLabel boxValue2;
    private javax.swing.JButton byteButton;
    private javax.swing.JLabel calculatedLbl;
    private javax.swing.JLabel challengueOne;
    private javax.swing.JButton changeCurrencyPosition;
    private javax.swing.JButton currencyButton;
    private javax.swing.JLabel dataFromInput;
    private javax.swing.JLabel developedByLbl;
    private javax.swing.JButton doConversion;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JButton farenheitButton;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel importLbl;
    private javax.swing.JButton rulerButton;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}