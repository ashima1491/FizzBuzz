package interfaces;

import models.FizzBuzzInput;

/**
 * Interface for FizzBuzz functionality.
 *
 */
public interface FizzBuzz {
   /**
    * method to generate FizzBuzz sequence
    * @param fizzBuzzInput the instance of class FizzBuzzInput, containing start of range,
    *       end of range, the divisors and the tokens
    */
	public void printSequence(FizzBuzzInput fizzBuzzInput);
	
}
