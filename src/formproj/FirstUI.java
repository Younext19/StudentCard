/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formproj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  

/**
 *
 * @author Dams
 */
class FirstUI extends JFrame implements ActionListener{
    
    // JTextField 
    static JTextField t; 
  
    // JFrame 
    static JFrame f; 
  
    // JButton 
    static JButton b; 
  
    // label to display text 
    static JLabel l; 
  
    // default constructor 
    FirstUI() 
    { 
    } 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to store text field and button 
        f = new JFrame("textfield"); 
  
        // create a label to display text 
        l = new JLabel("nothing entered"); 
  
        // create a new button 
        b = new JButton("submit"); 
  
        // create a object of the text class 
        FirstUI te = new FirstUI(); 
  
        // addActionListener to button 
        b.addActionListener(te); 
  
        // create a object of JTextField with 16 columns 
        t = new JTextField(20); 
        
  
        // create a panel to add buttons and textfield 
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(t); 
        p.add(b); 
        p.add(l); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(800, 600); 
  
        f.show(); 
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            // set the text of the label to the text of the field 
            l.setText(t.getText()); 
  
            // set the text of field to blank 
            t.setText("  "); 
        } 
    } 
}
