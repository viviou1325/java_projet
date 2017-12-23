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
      button1.addActionListener(this);
      button1.setBounds(50,30,150,40);
      
      j.setLayout(new BorderLayout());
      j.add(button1);
//      j.add(button1,BorderLayout.CENTER);
  }

    public void actionPerformed(ActionEvent evenement){
        if(evenement.getActionCommand().equals("menu_quitter")){
            if( JOptionPane.showConfirmDialog(null,"Voulez vous quitter?","Quitter",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE) ==  JOptionPane.YES_OPTION){
            System.exit(0);
            }
        }
        
        
        
    }
}
