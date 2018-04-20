/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbattle;

import java.util.Random;
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
		/*int userFactor = 4;
		Random rand = new Random();
	int eqArray[] = new int[3];
         eqArray[0] = userFactor;
        eqArray[1] = rand.nextInt(12);
        eqArray[2] = eqArray[0] * eqArray[1];*/

		//System.out.println(eqArray[2]);
	int playerNumber =0;
	Scanner in = new Scanner(System.in);
	System.out.println("enter 1 for single player mode. Enter 2 for two player mode: ");
	playerNumber = in.nextInt();
	if(playerNumber ==1)
		{
			System.out.println("Please enter your name: ");
			String playerName = in.next();
			System.out.println("Please enter the number you would like to study: ");
			int studyNumber = in.nextInt();
			Equation newEq = new Equation(studyNumber);
			MathController mc = new MathController(studyNumber, newEq);
			mc.setCurrentEquation();

		Interface FirstInterface = new Interface(playerNumber,playerName,mc);
		FirstInterface.FirstScreen();

		} /*else if (playerNumber ==2)
		{


		}else
		{

		}*/


	}


}


