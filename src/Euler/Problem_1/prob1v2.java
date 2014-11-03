package Euler.Problem_1;

import java.util.Iterator;
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

class CustomSet extends TreeSet
{
	private int sum;
	private Iterator itr;
	
	public int sum_of_set()
	{
		itr = iterator(); 		//grab the iterator object of the first item on the set
		Integer intObj = null;
		while (itr.hasNext())
		{
			intObj = (Integer)itr.next();
			sum += intObj;
		}
		return sum;
		
	}
}
public class prob1v2 {
	public static void main (String[] args)
	{
		final int MAX = 1000, N1 = 3, N2 = 5;
		CustomSet multiple_set_3_5 = new CustomSet();
		
		for (int i =1; i < (MAX+2)/N1; i ++ )
		{
			multiple_set_3_5.add(new Integer(i *N1));
			if (i*N2 < MAX)
			{
				multiple_set_3_5.add(new Integer(i *N2));
			}
		}
		System.out.println("The sum of the multiples of 3 or 5 less than 1000 is: " + multiple_set_3_5.sum_of_set() );
	}
}
