package action;

import java.util.TreeMap;

import interfaces.FizzBuzz;
import models.FizzBuzzInput;
/**
 * This class contains the implementation of FizzBuzz interface.
 * It can generate the sequence of tokens and numbers based upon the
 * inputs provided. 
 * 
 *
 */
public class SuperFizzBuzz implements FizzBuzz {
	
	/**
    * This method generates the sequence as per the input.
    * 
    * <p>It traverses through the input range of numbers and checks for every
    * number, its division by the divisors and accordingly appends
    * the token or the number in a StringBuilder instance.<p>
    * 
    * <p>As numbers up to a billion can be expected, to save memory, the StringBuilder instance is
    * cleared after a value is generated and printed<p>
    * 
    *<p> TreeMap is used to access the divisors in sorted 
    * order, so that if 4 and 2 were the divisors with tokens 'Frog' and 'Duck'
    * then 8 would be 'DuckFrog' and not 'FrogDuck'.<p>
    * 
    *
    *@param fizzBuzzInput the instance of FizzBuzzInput containing start of range,
    *       end of range, the divisors and the tokens. The range can be from Integer.MIN_VALUE to
    *       INTEGER.MAX_VALUE
    *@throws Arithmetic exception if a divisor is 0     
    *  
    */
	public void printSequence(FizzBuzzInput fizzBuzzInput)
	{
		
		int start= fizzBuzzInput.getStartOfRange();
		int end= fizzBuzzInput.getEndOfRange();
		TreeMap<Integer, String> map= fizzBuzzInput.getMap();

		StringBuilder  fizzBuzzOutput= new StringBuilder();
		for( int i=start; i<=end; i++ )
		{
			printValueAtPosition(map, fizzBuzzOutput, i);
		}

		}
		
	/**
	 * method to print the value at the ith position of sequence
	 * 
	 * @param map the key value pair of divisor and token. For e.g {3 : "Fizz"}
	 * @param fizzBuzzOutput an instance of StringBuilder which holds the current value of sequence
	 **@param i the position in sequence
	 */
	private void printValueAtPosition(TreeMap<Integer, String> map, StringBuilder fizzBuzzOutput, int i) {
		
			boolean flag;
			fizzBuzzOutput.setLength(0);
			flag=false;
			for(Integer num: map.keySet())
			{
				if(i%num==0)
				{
					fizzBuzzOutput.append(map.get(num));
					flag=true;
				}
					
			}
			
			if(!flag)
			{
				fizzBuzzOutput.append(i);
			}
			
			System.out.print(fizzBuzzOutput);
			
			System.out.print("\n");
		
	}

}
