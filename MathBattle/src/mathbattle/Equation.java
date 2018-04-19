package mathbattle;
import java.util.Random;
import java.util.Scanner;

public class Equation
{

   private int userFactor; 

   int[] product = new int[13]; 
   String[] equations = new String[13];
   Scanner input = new Scanner(System.in);
   Random rand = new Random();

    public Equation(int product)
    {
        userFactor = product;

    }

    public int table(int userFactor)
	{

	   for (int i = 0; i < product.length; i++)
	   {
		product[i] = i * userFactor;
   	   }

	   for (int i = 0; i < product.length; i++)
	   {
		System.out.printf("%d %c %d %c %d%n", 
		    userFactor, '\u00D7', i, '\u003D', product[i]);
		
	   } 

		return 0; // this isn't correct and will need to be changed.
	}

    public int[] getEquations()
    {
        int eqArray[] = new int[3];
         eqArray[0] = userFactor;
        eqArray[1] = rand.nextInt(11+1);
        eqArray[2] = eqArray[0] * eqArray[1];
        return eqArray;
    }
}

