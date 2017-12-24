/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitare;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author taka
 */
public class bouton implements ActionListener{
    Fenetre fenetre;
  public bouton(Fenetre j){
      JButton button1=new JButton("oui");
      button1.setActionCommand("oui");
      button1.addActionListener(this);
      
      button1.setBounds(50,30,75,40);
      button1.setBorder(null);
      button1.setBorderPainted(false);
      button1.setContentAreaFilled(false);
      button1.setOpaque(false);
      
      j.setLayout(new BorderLayout());
      j.add(button1);
      
//      j.add(button1,BorderLayout.CENTER);
  }

    public void actionPerformed(ActionEvent evenement){
        if(evenement.getActionCommand().equals("oui")){
            System.out.println("je fonctionne");
        }
        
        
        
    }
}
