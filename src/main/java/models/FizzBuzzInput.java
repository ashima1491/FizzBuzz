package models;

import java.util.TreeMap;
/**
 * A model class serving as input for generating FizzBuzz sequence.
 *
 */
public class FizzBuzzInput {

	/**
	 * the start of sequence
	 */
	private int startOfRange;
	
	/**
	 * the end of sequence
	 */
	private int endOfRange;
	
	/**
	 * key value pair of divisor and token
	 */
	private TreeMap<Integer,String> map= new TreeMap<>();
	
	public FizzBuzzInput() {
		super();
		
	}
	
	public FizzBuzzInput(int startOfRange, int endOfRange, TreeMap<Integer, String> map) {
		super();
		this.startOfRange = startOfRange;
		this.endOfRange = endOfRange;
		this.map = map;
	}
	
	public int getStartOfRange() {
		return startOfRange;
	}
	public void setStartOfRange(int startOfRange) {
		this.startOfRange = startOfRange;
	}
	public int getEndOfRange() {
		return endOfRange;
	}
	
	public void setEndOfRange(int endOfRange) {
		this.endOfRange = endOfRange;
	}
	public TreeMap<Integer, String> getMap() {
		return map;
	}
	public void setMap(TreeMap<Integer, String> map) {
		this.map = map;
	}
}
