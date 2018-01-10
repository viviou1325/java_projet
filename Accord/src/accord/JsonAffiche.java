/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accord;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author g16012996
 */
public class JsonAffiche {
       public JsonAffiche ()
       {
           System.out.println("lalalalalla");
    try{
       JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream("src/json/tesjson.json")));
       JsonParser jsonParser =new JsonParser();
       JsonObject userArray = jsonParser.parse(reader).getAsJsonObject();
       System.out.println(userArray);
       JsonArray majeur = userArray.getAsJsonArray("Majeur");
       System.out.println(majeur);
       System.out.println("lalalalalla");
       
       
}catch (Exception e) {
    System.err.println(e.getMessage());
} 
}
}
