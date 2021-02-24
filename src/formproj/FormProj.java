
package formproj;

import java.awt.*; 
import java.io.File;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

import java.util.Random;
import javax.swing.JFileChooser;

public class FormProj extends JFrame implements ActionListener{

   // Components of the Form 
    ImageIcon icon;
     JFrame c; 
     	private JFrame f = new JFrame("Login");

     JLabel title; 
     JLabel name;   
     JTextField tname; 
     JLabel mno; 
     JTextField tmno; 
     JLabel gender; 
     JLabel matricule; 
     JLabel randomNumber; 

     JRadioButton male; 
     JRadioButton female; 
     ButtonGroup gengp; 
     JLabel dob; 
     JComboBox date; 
     JComboBox month; 
     JComboBox year; 
     JLabel add; 
          JLabel matriculeNum; 
     JLabel YearOfStudies;
     JTextArea tadd; 
     JCheckBox term; 
     JButton sub; 
     JButton reset; 
     JTextArea tout; 
     JLabel res; 
     JTextArea resadd; 
  Image backgroundImage;
  
      JButton Button ;
          JLabel Text;

     String dates[] 
       = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Janvier", "fevrier", "Mar", "Avril", 
            "Mai", "Juin", "Juillet", "Aout", 
            "Septembre", "Octobre", "Novembre", "Decembre" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001" }; 
        static JLabel l; 

    
        
    public FormProj()
    {
        
        // HNA NDIR BUTTONA EYA ON PRESS NLANCé HAD FONCTION
                c=new JFrame("first way"); 
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

         
        
        setTitle("Inscription"); 
        setBounds(300, 90, 900, 700); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        
        c.setLayout(null); 
        Button = new JButton("Browse");
        Button.setBounds(100,40,100,100);
        c.add(Button); 
        
       
		
	

        title = new JLabel("Inscription"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(350, 10); 
        title.setOpaque(true);
        c.add(title); 
        
        //matriculeNum
        matriculeNum = new JLabel(""); 
        matriculeNum.setFont(new Font("Arial", Font.PLAIN, 20)); 
        matriculeNum.setSize(200, 20); 
        matriculeNum.setLocation(200, 150); 
        c.add(matriculeNum); 
        
        matricule = new JLabel("Matricule :"); 
        matricule.setFont(new Font("Arial", Font.PLAIN, 20)); 
        matricule.setSize(100, 20); 
        matricule.setLocation(100, 150); 
        c.add(matricule); 
        
        name = new JLabel("Nom :"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 200); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 200); 
        c.add(tname); 
  
        mno = new JLabel("Prénom"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(100, 250); 
        c.add(mno);
  
        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setSize(150, 20); 
        tmno.setLocation(200, 250); 
        c.add(tmno); 
  
        gender = new JLabel("Filiere"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 300); 
        c.add(gender); 
  
        male = new JRadioButton("MI"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 300); 
        c.add(male); 
  
        female = new JRadioButton("SM"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(275, 300); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("Date De Naissance"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(180, 20); 
        dob.setLocation(100, 350); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(300, 350); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(350, 350); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(420, 350); 
        c.add(year); 
  
        
       add = new JLabel("Faculté    "); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(200, 20); 
        add.setLocation(100, 400); 
        c.add(add); 
        
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(190, 40); 
        tadd.setLocation(200, 400); 
        tadd.setLineWrap(true); 
        c.add(tadd); 
        
        YearOfStudies = new JLabel("Année"); 
        YearOfStudies.setFont(new Font("Arial", Font.PLAIN, 20)); 
        YearOfStudies.setSize(200, 20); 
        YearOfStudies.setLocation(100, 450); 
        c.add(YearOfStudies); 
        
  
        term = new JCheckBox("Accepter les conditions"); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 500); 
        c.add(term); 
  
        sub = new JButton("Enregistrer"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 550); 
        sub.addActionListener(this); 

        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 550);
        reset.addActionListener(this);
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300,200);
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
  // sets 500 width and 600 height 
        c.setSize(900, 700); 
          
        // uses no layout managers 
        c.setLayout(null); 
          
        // makes the frame visible 
        c.setVisible(true); 
        //f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(Button);
		
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
			}
		});
		f.setSize(600,800);
		f.setVisible(false);
                
                
        // ON F WORK ON THE CARD STUDENT
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // create a frame 

        SwingUtilities.invokeLater(FormProj::new);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setVisible(false);
        f.setVisible(true);
        /*if (e.getSource() == sub) { 
            if (term.isSelected()) { 
                String data1; 
        Random num = new Random();
        String k = String.valueOf(Math.abs(num.nextInt()%1000000));
        matriculeNum.setText(k);
                String data 
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; 
                String data2 
                    = "Date De Naissance: "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
  
                String data3 = "Address : " + tadd.getText(); 
                tout.setText(data + data1 + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tadd.setText(def); 
            tmno.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def); 
        }   */
    }
    
}
