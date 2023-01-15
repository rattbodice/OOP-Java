import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.util.Random;

class Game extends JFrame implements ActionListener {

	final JLabel questionLabel;
    final JLabel answerLabel;
    private JButton button1 = new JButton(" ");
    private JButton button2 = new JButton(" ");
    private int point=0;
    private String answer="";

	public Game() {

		setTitle("Countries and Cities Game");
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		questionLabel = new JLabel();
        getContentPane().add(questionLabel,BorderLayout.PAGE_START);

        nextQuestion();

        getContentPane().add(button1);
        button1.addActionListener(this);
        getContentPane().add(button2);
        button2.addActionListener(this);



        answerLabel = new JLabel();
        getContentPane().add(answerLabel,BorderLayout.PAGE_END);

	}

    private void nextQuestion() {
    	Question question = Question.randomQuestion();
    	questionLabel.setText(question.getText());
        randomButtonQuestion(question);


    }

    private void randomButtonQuestion(Question a){
        Random r = new Random();
        int c = r.nextInt(2);

        if (c==1){
            button1.setText(a.getCorrectAnswer());
            button1.setActionCommand(a.getCorrectAnswer());
            button2.setText(a.getOtherAnswer());
            button2.setActionCommand(a.getOtherAnswer());
            answer = a.getCorrectAnswer();
        }
        else
        {
            button2.setText(a.getCorrectAnswer());
            button2.setActionCommand(a.getCorrectAnswer());
            button1.setText(a.getOtherAnswer());
            button1.setActionCommand(a.getOtherAnswer());
            answer = a.getCorrectAnswer();
        }


    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals(answer)){
            point++;
            answerLabel.setText("Correct! Score: "+point);
            nextQuestion();
        }
        else
        {
            point=0;
            answerLabel.setText("Sorry, you are wrong.");
            nextQuestion();
        }


    }

    public static void main(String[] args) {
		Game app = new Game();
		app.setVisible(true);
	}
}