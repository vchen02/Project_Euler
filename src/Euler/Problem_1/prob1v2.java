package Euler.Problem_1;

import java.util.Set;
import java.util.TreeSet;

/** Problem Statement  
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

/** Thought Process
 * 
 * @author VC
 * Use Set Collection to solve the same problem since when adding items into a Set, we can assume that it will not get duplicated
 * After all items are added, we can take the sum from the Set to display the answer.
 * 
 * 
 * 
 */

public class prob1v2 {
	public static void main (String[] args)
	{
		final int MAX = 1000, N1 = 3, N2 = 5;
		Set multiple_set_3_5 = new TreeSet();
		int sum = 0;
		
		System.out.println("The sum of the multiples of 3 or 5 less than 1000 is: " + sum);
	}
}
