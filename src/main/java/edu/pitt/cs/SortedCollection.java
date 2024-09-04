package edu.pitt.cs;

import java.util.TreeSet;
//TODO: Import libraries as needed
import java.util.Collections;
import java.util.NoSuchElementException;

public class SortedCollection {
	// TODO: Add member variables or methods as needed

	private TreeSet<Integer> collection;

	SortedCollection(){
	collection = new TreeSet<>();
	}

	/**
	 * Adds the number n to the collection.
	 * 
	 * @param n the number to add to the collection
	 * @return always returns true
	 */
	public boolean add(int n) {
		// TODO: Implement
		collection.add(n);

		//Collections.sort(collection);
		return true;
	}

	/**
	 * Removes the smallest number in the collection and returns it.
	 * If the collection is empty, throws a NoSuchElementException.
	 * 
	 * @return the smallest number in the collection
	 */
	public int remove() throws NoSuchElementException {
		// TODO: Implement

		if(collection.isEmpty()){
			throw new NoSuchElementException("Collection is empty");
		}

		//return collection.remove(0);
		return collection.pollFirst();
	}

	/**
	 * Prints usage information.
	 */
	public static void showUsage() {
		System.out.println("Usage: java SortedCollection [num1] [num2] [num3] ...");
	}


	/**
	 * Main method. Receives a list of numbers as commandline arguments and prints
	 * out the list in sorted order from smallest to largest.
	 * 
	 * @param args commandline arguments; see showUsage() for detailed information
	 */


	public static void main(String[] args) {
		SortedCollection collection = new SortedCollection();
		if (args.length == 0) {
			showUsage();
			return;
		}
		
		// TODO: add numbers in commandline arguments to collection using the add(int) method.
		// If any commandline argument is not a number, call showUsage() and return.
		
		/* 
		try {
			for(String arg : args){
				int num = Integer.parseInt(arg);
				collection.add(num);
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			showUsage();
			return;
		}
		*/

		
		

		
		
		

		
		System.out.print("sorted: ");
		for (int i = 0; i < args.length; i++) {
			int num = collection.remove();
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
