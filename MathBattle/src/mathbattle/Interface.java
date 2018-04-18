/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathBattle.src.mathbattle;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JO Phillips
 */
public class Interface
{

	private String name;
	private int state;

	Interface(int playerNumber, String playerName)
	{
		state = playerNumber;
		name = playerName;

	}

	public void FirstScreen()
	{

		JFrame FirstFrame = new JFrame();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(new JLabel("placeholder text"));
		panel2.add(new JTextField(10));
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
}
