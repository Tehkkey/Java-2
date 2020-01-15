import java.util.ArrayList;

import java.util.*;


public class ArrayListClient {

	public static void main(String[] args) 
	{
			//construct an ArrayList to hold integers
		
		ArrayList<Integer> javaList = new ArrayList<>();
		javaList.add(2);
		javaList.add(1);
		javaList.add(3);
		javaList.add(1,5);
		javaList.remove(1);
		
		
		
		System.out.println(javaList);
		
		//construct an ArrayIntList to hold integers
		
		ArrayIntList myList = new ArrayIntList();
		myList.add(2);
		myList.add(1);
		myList.add(3);
		myList.add(1,5);
		myList.remove(1);
		
		
		
		// print out a value at index 1
		
		System.out.println(myList);
		

	}

}
