/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author khopi
 */
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainClass {
    
    static JFrame aWindow;
    
    public static void main1() {
    aWindow = new JFrame();
    aWindow.setBounds(200, 200, 200, 200);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container content = aWindow.getContentPane();
    
    JLabel lblStanFunc = new JLabel("Are you here ?");
        lblStanFunc.setBounds(30, 30, 150, 30);
        lblStanFunc.setVisible(true);
        content.add(lblStanFunc);
    
    content.add(new MouseMotionEvents());
    
    
    
    aWindow.setVisible(true);
  }
    
    public void mClose() {
      
     try
     {   
      aWindow.dispose();
     }catch(Exception e){
         
     }
  }
    
    
}
