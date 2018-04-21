/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbattle;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static java.lang.Integer.parseInt;


/**
 *
 * @author JO Phillips
 */
public class Interface extends JFrame implements ActionListener
{

	private String name;
	private int state;
	private MathController mainMath; // fields
	private String userValue;

    JTextField answerTextField1 = new JTextField(10);  // instantiating elements
    JTextField answerTextField2 = new JTextField(10);  // instantiating elements
    JLabel EquationLabel = new JLabel();
    JButton CheckButton = new JButton("check");
    JLabel[] labelArray = new  JLabel[10];

    Interface(int playerNumber, String playerName, MathController mathController)
	{
		state = playerNumber;
		name = playerName;
		mainMath = mathController;

	}

	public void FirstScreen()
	{
        JFrame FirstFrame = new JFrame();
        JPanel panel2 = new JPanel();

		answerTextField1.setSize(12,40); //settings
        CheckButton.addActionListener(this);
        answerTextField1.addActionListener(this);
        EquationLabel.setText(mainMath.getMissingFaEq());

        panel2.setLayout(new FlowLayout()); // adding elements to panel
		panel2.add(EquationLabel);
		panel2.add(answerTextField1);
		panel2.add(CheckButton);

		FirstFrame.setVisible(true);   //frame settings and actions;
		FirstFrame.setContentPane(panel2);
		FirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FirstFrame.setTitle("MathBattle!");
		FirstFrame.pack();
	}

	public void SecondScreen()
	{

		JFrame SecondFrame = new JFrame();  // instantiating elements
		JPanel panel3 = new JPanel();
		SecondFrame.setTitle("MathBattle!");


        for(int i = 0; i<10;i++)
        {
            labelArray[i] = new JLabel(mainMath.getfullEq());
            panel3.add(labelArray[i]);
            labelArray[i].setBounds(20,40,20, 40 );
        }
		SecondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Settings and actions
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(new JLabel("Type the answer before timer runs out!"));
		answerTextField2.addActionListener(this);
		panel3.add(answerTextField2);
        SecondFrame.setContentPane(panel3);


		SecondFrame.setVisible(true);
		SecondFrame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
	   if(e.getSource() == answerTextField1)
        {

            userValue = answerTextField1.getText();
            int userValue1 = parseInt(userValue);

            if(mainMath.compareEquation(userValue1))
            {
            answerTextField1.setText("CORRECT!");
            mainMath.setCurrentEquation();
            EquationLabel.setText(mainMath.getMissingFaEq());


            }else
            {
                answerTextField1.setText("that wasn't correct");
            }
        }
        if(e.getSource() == answerTextField2)
        {
            userValue = answerTextField2.getText();
            int userValue2 = parseInt(userValue);
            if(mainMath.compareEquation1(userValue2))
            {
                answerTextField2.setText("CORRECT");
                mainMath.setCurrentEquation();
                for(int x =0; x<10; x++)
                {
                    labelArray[x].setText(mainMath.getfullEq());

                }
            } else
            {
                answerTextField2.setText("That wasn't Correct");
            }

        }
	}
}
