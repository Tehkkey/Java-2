/*
 * Kyle Sanchez
 * 10/19/2019
 * JavaLinkedList.java
 * This class uses JavalinkedListClient to input an int
 * array into an Integer linked list
 */


import java.util.*;


public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<>();
   
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<>();
		int[] num = nums;
		
		for(int i=0; i<num.length; i++)
		{
			int s = num[i];
			list.add(s);
		}
		
      
   }

	public double calcSum(  )
	{
		double total=0;
		for(int i=0; i<list.size(); i++)
		{
			total+=list.get(i);
		}
		
		return total;
	}

	public double calcAverage(  )
	{
		double sum = 0;
		for (int i=0; i< list.size(); i++) 
	      {
	            
	            sum +=list.get(i);
	      }
		return (sum/ list.size());
	}

	public int findLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int large: list)
		{
			if(large>largest)
			{
				largest=large;
			}
		}
		return largest;
	}

	public int findSmallest()
	{
		int smallest = Integer.MAX_VALUE;
		for(int small: list)
		{
			if(small<smallest)
			{
				smallest=small;
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}