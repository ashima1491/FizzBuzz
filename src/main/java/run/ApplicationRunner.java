package run;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

import action.SuperFizzBuzz;
import interfaces.FizzBuzz;
import models.FizzBuzzInput;
/**
 * This class contains the main method, which expects a user input
 * obtained through Scanner class, for generating FizzBuzz sequence.
 * 
 * User can enter values for start of range,
 * end of range, the divisors and the tokens
 *
 * User can generate the sequence as many times as he wants
 * and provide as many divisor and token pairs as he wants
 */
public class ApplicationRunner {


	private static final String Yes = "y";

	/**
	 * entry point of application
	 */
	public static void main(String[] args) {
		
		  // execute();
		System.out.print(1+"3");
		   System.out.println("****Thank You!! ");
	}

	/**
	 * method to interact with the user via console
	 * and call the SuperFizzBuzz, passing the user input to it
	 * 
	 *                                
	 */
	private static void execute() {
		Scanner scanner=null;
		try 
		{
		
			scanner = new Scanner(System.in);
			String repeat=Yes;
			while(Yes.equals(repeat))
			{
				FizzBuzzInput fizzBuzzInput= new FizzBuzzInput();

				getOpeningAndClosingRange(scanner, fizzBuzzInput);
				getNumAndTokenPairs(scanner, fizzBuzzInput);
				printSequence(fizzBuzzInput);
				
				System.out.println("****Want to repeat? [y/n] ");
				repeat=scanner.next();
			}
			
			
			
		} catch (InputMismatchException e) 
		{
			e.printStackTrace();
			System.out.println("One or more inputs did not match the expected data type! Please try again!");
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("An arithmetic exception occured! Please check your divisors (should not be a zero)!");
		}
		 catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Some error occurred! Please try again later!");
		}
		finally
		{
			scanner.close();
		}
		
		
		
	}

	/**
	 * method to print the FizzBuzz sequence
	 * @param fizzBuzzInput
	 */
	private static void printSequence(FizzBuzzInput fizzBuzzInput) {
		FizzBuzz fizzBuzzAction= new SuperFizzBuzz();
		fizzBuzzAction.printSequence(fizzBuzzInput);
		
	}

	/**
	 * method to get divisor and token pairs
	 * @param scanner
	 * @param fizzBuzzInput
	 */
	private static void getNumAndTokenPairs(Scanner scanner, FizzBuzzInput fizzBuzzInput) {
		TreeMap<Integer,String> map = new TreeMap<>();
		String token=Yes;
		while(Yes.equals(token))
		{
			System.out.println("****Enter divisor and token [3 fizz]");
			map.put(scanner.nextInt(), scanner.next());
			System.out.println("Have more tokens? [y/n] ");
            token=scanner.next().trim();
			
		}
		fizzBuzzInput.setMap(map);
		
	}

	/**
	 * method to get opening and closing range of sequence
	 * @param scanner
	 * @param fizzBuzzInput
	 */
	private static void getOpeningAndClosingRange(Scanner scanner, FizzBuzzInput fizzBuzzInput) {
		System.out.println("****Please enter the opening and closing range [-21474843647 2147483647] ");
		int userStart =scanner.nextInt();
		int userEnd =scanner.nextInt();
		
		int actualStart= Math.min(userStart, userEnd);
		int actualEnd= Math.max(userStart, userEnd);
		
		fizzBuzzInput.setStartOfRange(actualStart);
		fizzBuzzInput.setEndOfRange(actualEnd);
	}

}
