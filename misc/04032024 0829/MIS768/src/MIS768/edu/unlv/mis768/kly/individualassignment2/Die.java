package edu.unlv.mis768.kly.individualassignment2; // package edu.unlv.mis768.labwork9;
import java.util.Random;

/**
   The Die class simulates a die with any side.
*/

public class Die {
   private int sides;   // Number of sides
   private int value;   // The die's value
   
   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public Die(int numSides) {
      sides = numSides;
      roll();
   }
   
   /**
      The roll method simulates the rolling of
      the die.
   */
   
   public void roll() {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1; // there is no zero on a die, so 1 is added
   }
   
   /**
      getSides method
      @return The number of sides for this die.
   */
   
   public int getSides() {
      return sides;
   }
   
   /**
      getValue method
      @return The value of the die.
   */
   
   public int getValue() {
      return value;
   }
}