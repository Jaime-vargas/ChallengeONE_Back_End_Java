/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.api;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author jaime
 */
public class APIConnections {
    private final static String URL_VALUES = "https://openexchangerates.org/api/latest.json?app_id=a5a366187c814a13bcd8d6f42ba0a7e1";
    private final static String URL_CURRENCIES = "https://openexchangerates.org/api/currencies.json";
   
    // Getters
    public static JSONObject getValues() {
        return getJSONResponse(URL_VALUES);
    }

    public static JSONObject getCurrencies() {
        return getJSONResponse(URL_CURRENCIES);
    }
    
    
   // Metodo para retornar objetos Json desde las consultas.
    private static JSONObject getJSONResponse(String URL_API) {
        try {
            
            // inicio de conexion
            URL url = new URI(URL_API).toURL();
            
            // Leer contenido de respuesta de la conexion
            // Crear String Builder para insertar los datos
            StringBuilder stringBuilderResponse = new StringBuilder();
            
            // Llenar string builder con respuesta del OpenStream
            try (Scanner response = new Scanner(url.openStream())) {
                // Llenar string builder con respuesta del OpenStream
                while (response.hasNext()) {
                    stringBuilderResponse.append(response.nextLine());
                }
            }
            
            // convierte objeto en JSONObject y lo exporta           
            JSONObject josnResponse = new JSONObject(stringBuilderResponse.toString());
            
                if(josnResponse.has("rates")){
                    JSONObject  jsonRates = josnResponse.getJSONObject("rates");          
                    return jsonRates;
                }else{
                    return josnResponse;
                }
      
        } catch (URISyntaxException | IOException e) {
            return null;
        }
    }
}
