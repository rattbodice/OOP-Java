import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FracSimple extends JFrame{
    final JTextField topField;
    final JTextField bottomField;
    final JLabel equalsLabel;

    public FracSimple(){
        setTitle("Fraction to Real");
        setSize(280,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        final JPanel calcTopPanel = new JPanel(new FlowLayout());
        getContentPane().add(calcTopPanel, BorderLayout.CENTER);
        
        final JButton calcButton = new JButton("Convert");
        getContentPane().add(calcButton, BorderLayout.PAGE_END);

        // calc panel is FlowLayout
        topField = new JTextField("1",2);
        calcTopPanel.add(topField);

        final JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
        calcTopPanel.add(plusLabel);

        bottomField = new JTextField("3",2);
        calcTopPanel.add(bottomField);

        equalsLabel = new JLabel("= ?");
        equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
        calcTopPanel.add(equalsLabel);
    }

    public static void main(String[] args) {
        FracSimple app = new FracSimple();
        app.setVisible(true);
    }
    
}
