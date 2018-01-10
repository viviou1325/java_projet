/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import  
 
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 *
 * @author taka
 */
public class Accord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fenetre fen;
        fen = new Fenetre("Guitare");
        
        String url  ="src\\json\\tesjson";
        JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(url)));
        JsonParser jsonParser = new JsonParser();
        JsonObject userArray = jsonParser.parse(reader).getAsJsonObject();
        System.out.println(userArray);
        JsonArray objets = userArray.getAsJsonArray("Objets ");
        System.out.println("listeAccord");
    }
}
    
/*}
public class Json{
   
}*/