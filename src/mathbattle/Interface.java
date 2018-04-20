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

    JTextField answerTextField = new JTextField(10);  // instantiating elements
    JLabel EquationLabel = new JLabel();
    JButton CheckButton = new JButton("check");

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

		answerTextField.setSize(12,40); //settings
        CheckButton.addActionListener(this);
        answerTextField.addActionListener(this);
        EquationLabel.setText(mainMath.getMissingFaEq());

        panel2.setLayout(new FlowLayout()); // adding elements to panel
		panel2.add(EquationLabel);
		panel2.add(answerTextField);
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
        JLabel[] labelArray = new  JLabel[10];


        for(int i = 0; i<10;i++)
        {
            labelArray[i] = new JLabel("cool beans");
            panel3.add(labelArray[i]);
            labelArray[i].setBounds(20,40,20, 40 );
        }
		SecondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Settings and actions
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(new JLabel("Type the answer before timer runs out!"));
		panel3.add(new JTextField());
        SecondFrame.setContentPane(panel3);


		SecondFrame.setVisible(true);
		SecondFrame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
        userValue = answerTextField.getText();
       int userValue1 = parseInt(userValue);

        if(mainMath.compareEquation(userValue1))
        {
            answerTextField.setText("CORRECT!");
            mainMath.setCurrentEquation();
            EquationLabel.setText(mainMath.getMissingFaEq());

        }else {
            answerTextField.setText("that wasn't correct");
        }
       }
}
