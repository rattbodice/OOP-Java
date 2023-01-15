import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FracSimple2 extends JFrame implements ActionListener {
    final JTextField topField;
    final JTextField bottomField;
    final JTextField topField2;
    final JTextField bottomField2;
    final JLabel equalsLabel;

    public FracSimple2(){
        setTitle("Fraction to Real2");
        setSize(280,110);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        final JPanel bigCalcPanel = new JPanel(new FlowLayout());
        getContentPane().add(bigCalcPanel);

        final JPanel calcfirstPanel = new JPanel(new GridLayout(2,1));
        bigCalcPanel.add(calcfirstPanel);
        final JPanel plusPanel = new JPanel(new BorderLayout());
        bigCalcPanel.add(plusPanel);
        final JPanel calctwoPanel = new JPanel(new GridLayout(2,1));
        bigCalcPanel.add(calctwoPanel);
        final JPanel answerPanel = new JPanel(new BorderLayout());
        bigCalcPanel.add(answerPanel);
        
        final JButton calcButton = new JButton("Convert");
        getContentPane().add(calcButton, BorderLayout.PAGE_END);
        calcButton.addActionListener(this);

        topField = new JTextField("1",2);
        calcfirstPanel.add(topField);
        bottomField = new JTextField("3",2);
        calcfirstPanel.add(bottomField);

        final JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
        plusPanel.add(plusLabel);

        topField2 = new JTextField("2",2);
        calctwoPanel.add(topField2);
        bottomField2 = new JTextField("5",2);
        calctwoPanel.add(bottomField2);

        

        equalsLabel = new JLabel("= ?");
        equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
        answerPanel.add(equalsLabel);
    }

    public static void main(String[] args) {
        FracSimple2 app = new FracSimple2();
        app.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(topField.getText());
        int b = Integer.parseInt(bottomField.getText());
        int f = Integer.parseInt(topField2.getText());
        int g = Integer.parseInt(bottomField2.getText());

        int answerTop =0;
        int answerBottom =0;

        if (b!=g){
            answerBottom= b*g;
            a= a*g;
            f= f*b;
            answerTop = a+f;
        } 
        else 
        {
            answerBottom=g;
            answerTop = a+f;
        }

        if (answerTop%answerBottom==0){
            String answer = Integer.toString(answerTop/answerBottom);
            equalsLabel.setText("= "+answer);
        } else {
            String answer = Integer.toString(answerTop)+"/"+Integer.toString(answerBottom);
            equalsLabel.setText("= "+answer);
        }
    }
    
}
