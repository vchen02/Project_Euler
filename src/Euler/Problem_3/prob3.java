package Euler.Problem_3;

import java.util.ArrayList;
import java.util.Collections;

/** Problem Statement
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @author VC
 *
 */

/** Thought Process
 * Example 1
 * num = 13195 
 * 5 | 2639
 * 7 | 377
 * 13| 29
 * 29| prime
 * 
 * Example 2
 * num = 1025
 * 5 | 205
 * 5 | 41
 * 41| prime
 * @author VC
 *
 */

public class prob3 {

	public static int maxPrimeFactor(long num)
	{
		ArrayList<Integer> factor_list = new ArrayList<Integer>();
		for (int i = 2; i <= num; i ++)
		{
			//repeatedly factor 'i' until it is no longer a factor of num
			while (num % i == 0)
			{
				//add 'i' as a current factor in the array list
				factor_list.add (i);
				num /= i;
			}		
		}
		
		Collections.sort(factor_list);
		
		//access the last element of the sorted list for the largest prime number
		return factor_list.get(factor_list.size() -1 );	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long MAX = 600851475143L;
		
		System.out.println(" The largest prime factor of " + MAX + " is: " + maxPrimeFactor(MAX));
	}

}
