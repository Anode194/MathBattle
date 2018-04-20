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

/**
 *
 * @author JO Phillips
 */
public class Interface implements ActionListener
{

	private String name;
	private int state;
	private MathController mainMath;
	private String userValue;

	Interface(int playerNumber, String playerName, MathController mathController)
	{
		state = playerNumber;
		name = playerName;
		mainMath = mathController;

	}

	public void FirstScreen()
	{
		JTextField answerTextField = new JTextField();
		answerTextField.setSize(12,40);
        String userValue = answerTextField.getText();
		answerTextField.addActionListener(this);
        JLabel EquationLabel = new JLabel();
	    EquationLabel.setText("hello");

        JButton CheckButton = new JButton("check");
        CheckButton.addActionListener(this);
		JFrame FirstFrame = new JFrame();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(answerTextField);
		panel2.add(new JTextField(10));
		panel2.add(CheckButton);
		FirstFrame.setVisible(true);
		FirstFrame.setContentPane(panel2);
		FirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FirstFrame.setTitle("MathBattle!");
		FirstFrame.pack();
	}

	public void SecondScreen()
	{

		JFrame SecondFrame = new JFrame();
		JPanel panel3 = new JPanel();
		SecondFrame.setTitle("MathBattle!");
		SecondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel3.setLayout(new GridLayout(6, 6, 6, 3));
		panel3.add(new JLabel("Type the answer before timer runs out!"));
		panel3.add(new JTextField(10));
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
	   if(mainMath.compareEquation(Integer.parseInt(userValue))) {
           System.out.println("correct!");

       }
       }
}