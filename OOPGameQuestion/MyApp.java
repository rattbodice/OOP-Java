import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyApp extends JFrame implements ActionListener {
    final JLabel resultLabel;

    public MyApp(){
        setTitle("64314783");
        setSize(300,200);
        setLocation(10,150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel("Hello Mor Nor");
        getContentPane().add(label);

        final JButton button1 = new JButton("Yes Flash");
        button1.setActionCommand("Yes");
        button1.addActionListener(this);
        getContentPane().add(button1);
        final JButton button2 = new JButton("No Flash");
        button2.setActionCommand("No");
        button2.addActionListener(this);
        getContentPane().add(button2);

        resultLabel = new JLabel("");
        getContentPane().add(resultLabel);


    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Yes")){
            resultLabel.setText("What do you call three humped camel?");
        }
        else {
            resultLabel.setText("");
        }
    }
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.setVisible(true);
    }
}
