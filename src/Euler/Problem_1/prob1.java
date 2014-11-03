package Euler.Problem_1;
import java.util.*;

/** Problem Statement  
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */


/** Thought process
 * Find Multiples of 3
 * for int n: 1 to 333
 * multiples of 3 are n*3
 * take a running sum of the multiples
 *
 * 
 * Find Multiples of 5
 * for int n: 1 to 199
 * multiples of 5 are n*3
 * add to the running sum if it is not a multiple of 3
 * 
 * 
 */

public class prob1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 1000, N1 = 3, N2 = 5;
		int sum = 0;
		
		for (int i =1; i < (MAX+2)/N1; i ++ )
		{	
			
			sum += i *N1;
			//System.out.println("" +(i*N1));
			
			if( i*N2 < MAX && ((i*N2)%N1) != 0 )
			{
				sum += i*N2;
				//System.out.println("" +(i*N2));
			}
		}
		
		System.out.println("The sum of the multiples of 3 or 5 less than 1000 is: " + sum);
	}

}
