/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbattle;

import java.util.Scanner;

/**
 *
 * @author JO Phillips
 */
public class MathBattle
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
	
	int playerNumber =0;
	Scanner in = new Scanner(System.in);
	System.out.println("enter 1 for single player mode. Enter 2 for two player mode: ");
	playerNumber = in.nextInt();
	if(playerNumber ==1)
		{
			System.out.println("Please enter your name: ");
			String playerName = in.next();
		Interface FirstInterface = new Interface(playerNumber,playerName);
		FirstInterface.FirstScreen();

		} /*else if (playerNumber ==2)
		{


		}else
		{

		}*/


	}


}


