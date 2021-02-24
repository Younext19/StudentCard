
package formproj;

import java.awt.*; 
import java.io.File;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*; 
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;

public class FormProj extends JFrame implements ActionListener{

   // Components of the Form 
    ImageIcon icon;
     JFrame c; 
     	private JFrame f = new JFrame("Login");
    JFileChooser chooser;

     JLabel title; 
     JLabel name;   
     JTextField tname; 
     JLabel mno; 
     JTextField tmno; 
     JLabel gender; 
     JLabel matricule; 
     JLabel randomNumber; 
     JTextField YEAR; 
JFileChooser j = new JFileChooser(new File("C:\\Users\\Dams\\")); 

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
     JTextField tadd; 
     JCheckBox term; 
     JButton sub; 
     JButton reset; 
     JTextArea tout; 
     JLabel res; 
     JTextArea resadd; 
     JLabel DDN;
     JLabel NAME;
     JLabel SURNAME;
     JLabel FILIERE;
     JLabel FACULTY;
     JLabel ANNEE;
     JLabel IMAGE;
  Image backgroundImage;
  JLabel img;
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

    String no = "haddam";
                String pre = "younes";
                String Fil= "MI";
                String FAC = "UNIV MOSTA INFORMATIQUE";
                String an = "2020/2021";
        
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
        Button.setBounds(100,20,100,20);
        c.add(Button); 
        
        img = new JLabel();
                img.setBounds(100,40,100,100);
        c.add(img); 

       Button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
          JFileChooser file = new JFileChooser();
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", ".jpg","gif",".png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              img.setIcon(ResizeImage(path));
              IMAGE.setIcon(ResizeImage(path));
          }
           //if the user click on save in Jfilechooser


          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
        }
    });
		
	

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
        
  
        
        tadd = new JTextField(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(150, 20); 
        tadd.setLocation(200, 400); 
        c.add(tadd); 
        
        YearOfStudies = new JLabel("Année"); 
        YearOfStudies.setFont(new Font("Arial", Font.PLAIN, 20)); 
        YearOfStudies.setSize(200, 20); 
        YearOfStudies.setLocation(100, 450); 
        c.add(YearOfStudies); 
        
        YEAR = new JTextField(); 
        YEAR.setFont(new Font("Arial", Font.PLAIN, 15)); 
        YEAR.setSize(150, 20); 
        YEAR.setLocation(200, 450); 
        c.add(YEAR); 
        
  
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
  
        
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        
        
  // sets 500 width and 600 height 
        c.setSize(700, 700); 
          
        // uses no layout managers 
        c.setLayout(null); 
          
        // makes the frame visible 
        c.setVisible(true); 
        //f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
        f.setSize(450,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.RED);
        
        NAME = new JLabel("Nom : "+no); 
        NAME.setFont(new Font("Arial", Font.PLAIN, 20)); 
        NAME.setSize(200, 20);
        NAME.setLocation(50, 50); 
        f.add(NAME); 
        
        SURNAME = new JLabel("Prénom : "+pre); 
        SURNAME.setFont(new Font("Arial", Font.PLAIN, 20)); 
        SURNAME.setSize(200, 20);
        SURNAME.setLocation(50, 80); 
        f.add(SURNAME);
        
        FILIERE = new JLabel("Filière : "+Fil); 
        FILIERE.setFont(new Font("Arial", Font.PLAIN, 20)); 
        FILIERE.setSize(200, 20);
        FILIERE.setLocation(50, 110); 
        f.add(FILIERE);
        
        FACULTY = new JLabel("Faculté : "+FAC); 
        FACULTY.setFont(new Font("Arial", Font.PLAIN, 20)); 
        FACULTY.setSize(200, 20);
        FACULTY.setLocation(50, 140); 
        f.add(FACULTY);
        
        
        ANNEE = new JLabel("ANNEE : "+an); 
        ANNEE.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ANNEE.setSize(200, 20);
        ANNEE.setLocation(50, 170); 
        f.add(ANNEE);
        DDN = new JLabel("23/04/2001"); 
        DDN.setFont(new Font("Arial", Font.PLAIN, 20)); 
        DDN.setSize(200, 20); 
        DDN.setLocation(50, 200); 
        f.add(DDN);
        
        IMAGE = new JLabel();
        IMAGE.setBounds(300,40,100,100);
        f.add(IMAGE); 
        // ON F WORK ON THE CARD STUDENT
    }
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img2 = MyImage.getImage();
        Image newImg = img2.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // create a frame 

        SwingUtilities.invokeLater(FormProj::new);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
                f.setVisible(false);

        f.setVisible(true);
        NAME.setText("Nom : "+tname.getText());
        SURNAME.setText("Prénom : "+tmno.getText());
        if (male.isSelected()) 
                    FILIERE.setText("Filière : Math Info") ;
        else
            FILIERE.setText("Filière : Science M") ;
                            
        DDN.setText(""
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n" );
        FACULTY.setText("Faculté : " + tadd.getText());
        ANNEE.setText("Année : "+ YEAR.getText());
        if (e.getSource() == sub) { 
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
        }   
    }
    
}
