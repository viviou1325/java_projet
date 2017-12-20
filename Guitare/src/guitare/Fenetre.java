/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitare;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author taka
 */
public class Fenetre extends JFrame{
    Image img;
    
    Fenetre(String s){
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocation(100,100);
        setSize(974,540);
        
        //éditeur de texte
        //scroll bar
        JScrollPane scroll = new JScrollPane();
        getContentPane().add(scroll);
        
        
        
        
        setVisible(true);
        setResizable(false);
        
        //pack();

    }
    
}
