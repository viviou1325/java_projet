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
    ImageIcon select,unselect;
    boolean selected;
    private Container content;
  public bouton(Fenetre j){
      try{
      ImageIcon unselect= new ImageIcon("C:\\Users\\taka\\Desktop\\java\\java_projet\\Guitare\\src\\image\\icon.png");
      ImageIcon select= new ImageIcon("C:\\Users\\taka\\Desktop\\java\\java_projet\\Guitare\\src\\image\\icon_selected.png");
      }catch(Exception e){
          e.printStackTrace();
      }
      content = j.getContentPane();
      content.setBackground(Color.white);
      content.setLayout(new GridLayout(5,6));
      JButton button[][]=new JButton[5][6];
      
      for(int i = 0; i< button.length; ++i)
          for(int k = 0; k<6;++k){
              button[i][k].setIcon(unselect);//pb
              content.add(button[i][k]);
          }
//      button.setActionCommand("ou");
//      button.addActionListener(this);
//      
//      button.setBounds(80,80,75,40);
//      button.setBorder(null);
//      button.setBorderPainted(false);
//      button.setContentAreaFilled(false);
//      button.setOpaque(false);
//      
//      button1.setBounds(80,30,75,40);
//      button1.setBorder(null);
//      button1.setBorderPainted(false);
//      button1.setContentAreaFilled(false);
//      button1.setOpaque(false);
      
//      j.setLayout(new BorderLayout());
//      j.add(button1);
//      j.add(button);
      
  }

    public void actionPerformed(ActionEvent evenement){
        if(evenement.getActionCommand().equals("oui")){
//            if(!selected()){
//                
//            }
        }
        
        
        
    }
    
//    private boolean selected(JButton b){
//        boolean s = false;
//        if()
//        
//        return s;
//    }
}
