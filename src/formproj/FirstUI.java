// MyLogin.java
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class FirstUI {
	private JFrame f = new JFrame("Login");
	private JButton bok = new JButton("OK");
	JLabel title; 

	public FirstUI() {
	
		//f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(bok);
		
		bok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new SecondFrame();
			}
		});
		f.setSize(600,800);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstUI();
	}
}