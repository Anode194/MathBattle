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


	Scanner in = new Scanner(System.in);
        int userInput;
        long eqDelay;
        long timerTime;

        System.out.println("Please enter your difficulty level: ");
        System.out.print("Enter 1 for Easy, 2 for Medium, 3 for Difficult: ");
        userInput = in.nextInt();
        in.nextLine();
        System.out.println();

        switch (userInput)
        {
            case 1: {eqDelay = 7;
                timerTime = 60;
                break;}
            case 2: {eqDelay = 4;
                timerTime = 45;
                break;}
            case 3: {eqDelay = 2;
                timerTime = 30;
                break;}
            default:{System.out.println("Surprise! Insane mode activated!");
                eqDelay = 1;
                timerTime = 15;
                break;}
        }



        System.out.println("Please enter your name: ");
			String playerName = in.next();
			System.out.println("Please enter the number you would like to study: ");
			int studyNumber = in.nextInt();
			Equation newEq = new Equation(studyNumber);
			MathController mc = new MathController(studyNumber, newEq);
			mc.setCurrentEquation();

		Interface FirstInterface = new Interface(,playerName,mc,eqDelay,timerTime);
		FirstInterface.SecondScreen();



	}


}


