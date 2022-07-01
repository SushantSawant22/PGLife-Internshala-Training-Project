import java.awt.*;    
import javax.swing.*; 
import java.awt.event.*;//ActionLisner   
import javax.swing.ImageIcon;
    




public class BL implements ActionListener
{    
JFrame f;    
BL()  
{    
     


f = new JFrame("Digital Quest");   
    
   /* Font F1 = new Font ("Serif", Font.BOLD, 30);*/
    
    ImageIcon img = new ImageIcon("img2.jpeg");
    Image i = img.getImage(); 
    Image new_img = i.getScaledInstance(300,300,Image.SCALE_SMOOTH);
    img =new ImageIcon(new_img);
    JLabel l1=new JLabel("",img,JLabel.CENTER);
    l1.setBounds(400,50,400,400);

    JLabel l2 = new JLabel("score"); 
    f.add(l2); 
 /*   JLabel l3 = new JLabel();*/
      

// creating buttons  
    JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH   
    JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH  
    JButton b3 = new JButton("EAST");; // the button will be labeled as EAST  
    JButton b4 = new JButton("WEST");; // the button will be labeled as WEST  
    //JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER 


//add a button
    JButton b5 = new JButton("NEXT");
    b5.setBounds(600, 600, 300, 100);
    //add button to the frame
    f.add(b5); 
    b5.setFont(new Font("Cambria", Font.BOLD,30));


    //f.add(l1);
    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
    //f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
    f.add(l1, BorderLayout.CENTER);  // b2 will be placed in the Center    
            

    f.setSize(300, 300);    
    f.setVisible(true);
 
        
}

public void actionPerformed(ActionEvent event){
    if(event.getActionCommand().equals("NORTH")){
        System.out.println("North");
    }
    else if(event.getActionCommand().equals("SOUTH")){
        System.out.println("South");
    }
}

public static void main(String[] args) {    
    new BL();    
} 
}
