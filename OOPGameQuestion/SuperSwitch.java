import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SuperSwitch  extends JFrame implements ActionListener{
    JButton button1;
    JButton button2;
    JLabel label1;
    public SuperSwitch(){
        setTitle("SuperSwitch");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /////////////////// Panel
        Panel p = new Panel();
        p.setLayout(new GridLayout(1,3));
        



        ////////////// JButton
        button1 = new JButton("↑");
        button2 = new JButton("↓");
    
        ////////////// JLabel

        label1 = new JLabel("  Unknown");



        ///////////// Add to JFrame
        getContentPane().add(p);
        p.add(button1);
        button1.setActionCommand("Up");
        p.add(button2);
        button2.setActionCommand("Down");
        p.add(label1);

        /////////// Add Action
        button1.addActionListener(this);
        button2.addActionListener(this);

        


        
    
        
     }

     public void actionPerformed(ActionEvent e){
         if (e.getActionCommand() == button1.getActionCommand())
         {
            label1.setText("Up");
         }  
         else if (e.getActionCommand() == button2.getActionCommand())
         {
            label1.setText("Down");
         }       
     }


    public static void main(String[] args) {
        SuperSwitch app = new SuperSwitch();
        app.setVisible(true);
        }
         
}
