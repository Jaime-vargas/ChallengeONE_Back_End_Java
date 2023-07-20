/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.app;

import com.conversor.objects.Buttons;
import com.conversor.objects.Currency;
import com.conversor.objects.Degrees;
import com.conversor.objects.Ruler;
import com.conversor.objects.Units;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.json.JSONObject;

/**
 *
 * @author jaime
 */
public class Util {
    
    public static List<Units> fillCurrenciesArrayList(JSONObject jsonCurrencies, JSONObject jsonValues ){
        List<Units> currencies = new ArrayList<>();
        Iterator<String> keys = jsonCurrencies.keys();
        
        while (keys.hasNext()) {
            String key = keys.next();
            /*
             * Esta linea se debe a que hay uncampo de mas en la consulta de la API 
             * se trata del campo "VEF" asi que se añade la condicional para evitar errores con los valores
             */
            if(!key.equals("VEF")){
                String name = jsonCurrencies.getString(key);
                float floatValue = jsonValues.getBigDecimal(key).floatValue();
                currencies.add(new Currency(key, name , floatValue));
            }    
  
         }
        return currencies;
        
        
        
    }
    
    public static List<Units> sortArrayList( JSONObject jsonCurrencies, JSONObject jsonValues){
        List<Units> currencies = fillCurrenciesArrayList(jsonCurrencies, jsonValues);
        Comparator<Units> comparator = new CurrencyComparator();   
        currencies.sort(comparator);
        return currencies;
    }

    private static void sortArraylist(List<Units> currencies) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static class CurrencyComparator implements Comparator<Units> {
    @Override
    public int compare(Units unit1, Units unit2) {
        return unit1.getName().compareTo(unit2.getName());
    }
}
    public static void fillBoxes(List<Units> objects, javax.swing.JComboBox<String> currencyBox1, javax.swing.JComboBox<String> currencyBox2){
        currencyBox1.removeAllItems();
        currencyBox2.removeAllItems();
        for (Units object : objects) {
            currencyBox1.addItem(object.getFullName());
            currencyBox2.addItem(object.getFullName());
        }
    }
    
    public static List<Units> fillDegreesArrayList(){
         List<Units> degrees = new ArrayList<>();
         degrees.add(new Degrees("C","Celsius"));
         degrees.add(new Degrees("F", "Farenheit"));
         return degrees;
    }
    public static List<Units> fillRulerArrayList(){
        List<Units> ruler = new ArrayList<>();
        String[] keys = {"MM", "CM","DM", "M","DAM", "HM", "KM" };
        String[] names = {"Milimetros","Centimetros","Decimetros","Metros","Decametros","Hectometros", "Kilometros"};
        float[] values = {0.001f, 0.01f, 0.1f, 1f, 10f, 100f, 1000f};
        
        for(int i =0; i < keys.length; i++){
            ruler.add(new Ruler(keys[i], names[i], values[i]));
        }
         return ruler;
    }
    
    public static List<Units> fillBytesArrayList(){
        List<Units> bytes = new ArrayList<>();
        String[] keys = {"B", "KB","MB", "GB","TB"};
        String[] names = {"Byte","Kilobyte","Megabyte","Gigabyte","Terabyte"};
        float[] values = {1.0f, 1024.0f, 1024*1024f, 1024*1024*1024f, 1024*1024*1024*1024f};
        
        for(int i =0; i < keys.length; i++){
            bytes.add(new Ruler(keys[i], names[i], values[i]));
        }
         return bytes;
    }
    
    public static void fillButtons(List<Buttons> buttonList,JButton currencyButton, JButton farenheitButton, JButton rulerButton, JButton byteButton, JButton changeCurrencyPosition) {
       
       
        
        //Tittles
        final String currencyTittle = "Conversor de Monedas";
        final String farenheitTittle = "Conversor de Temperatura";
        final String rulerTittle = "Conversor de Distancia";
        final String bytesTittle = "Conversor de Bytes";
        
        //Iconos y sus Rutas
        
         String userDir = System.getProperty("user.dir");
         String imgFolder = "/src/main/java/com/conversor/img/";
         final String PATCH = userDir + imgFolder;
         
         changeCurrencyPosition.setIcon(new javax.swing.ImageIcon(PATCH + "Arrows.jpg"));
         
        
        final ImageIcon currency = new javax.swing.ImageIcon(PATCH + "currency.jpg");
        final ImageIcon currencySelected = new javax.swing.ImageIcon(PATCH + "currency_selected.jpg");
    
        final ImageIcon farenheit = new javax.swing.ImageIcon(PATCH + "farenheit.jpg");
        final ImageIcon farenheitSelected = new javax.swing.ImageIcon(PATCH + "farenheit_selected.jpg");
    
        final ImageIcon ruler = new javax.swing.ImageIcon(PATCH + "ruler.jpg");
        final ImageIcon rulerSelected = new javax.swing.ImageIcon(PATCH + "ruler_selected.jpg");
    
        final ImageIcon bytes = new javax.swing.ImageIcon(PATCH + "byte.jpg");
        final ImageIcon bytesSelected = new javax.swing.ImageIcon(PATCH + "byte_selected.jpg");
        
        JButton[] buttons = {currencyButton, farenheitButton, rulerButton, byteButton};
        ImageIcon[] icons = {currency, farenheit, ruler, bytes};
        ImageIcon[] iconsSelected = {currencySelected, farenheitSelected, rulerSelected, bytesSelected};
        String [] tittles = {currencyTittle, farenheitTittle, rulerTittle, bytesTittle};
        
        for(int i = 0; i<buttons.length ; i++){
            buttonList.add(new Buttons(buttons[i],icons[i],iconsSelected[i],tittles[i]));
        }
    
    }
    public static String formatValues(double value){
        
        BigDecimal bigDecimalValue = new BigDecimal(Double.toString(value));
        int decimalPlaces = bigDecimalValue.scale();
        if (decimalPlaces > 8){
            decimalPlaces = 8;
        }
        String format = "%." + decimalPlaces + "f";
        String formattedNumber = String.format(format, value);
        return formattedNumber;
    }
    
    public static Image IconImage() {
    String userDir = System.getProperty("user.dir");
    String imgFolder = "/src/main/java/com/conversor/img/";
    final String PATCH = userDir + imgFolder;
    Image image = null;
    try {
        image = ImageIO.read(new File(PATCH + "icon.png"));
    } catch (IOException e) {
        // Manejo de errores, por ejemplo, mostrar una imagen de reemplazo o un log
    }
    return image;
}
 
}
