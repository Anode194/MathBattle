/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbattle;

/**
 *
 * @author JO Phillips
 */
public class Player 
{
   private int health;
   private int attackPower;
   private boolean playerDefeated;

   public Player(int h, int a)
   {
 	if (h >= 0) 
	   health = h;

	if (a >= 0)
	   attackPower = a; 
   }

   public int getHealth()
   {
	return health;
   }

   public int getAttackPower()
   {
	return attackPower;
   } 

   public boolean isPlayerDefeated()
   {
	return playerDefeated;
   }


   public int damageReceived(int d) 
   {
	health -= d;

	if (health <= 0)
	{
	   playerDefeated = true;
	}
   } 
}