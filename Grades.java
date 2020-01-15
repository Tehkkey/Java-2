/**
    * Kyle Sanchez
 * Grades.java
 * 10/10/2019
 * This class contains various methods to use alongside the GradesClient.java
 * that will help build and sort a list of student grades.
 *
 */

import java.util.ArrayList;

public class Grades {

	
	// instance variable
	private static ArrayList<Double> grades;
	
	// default constructor
	public Grades()
	{
		grades = new ArrayList<>();
	}
	
	
	//calculates the average of all grades in ArrayList & returns average
	public double calcAverage()
	{
		int sum = 0;
	      for (int i=0; i< grades.size(); i++) 
	      {
	            
	            sum+=grades.get(i);
	      }
	      return (sum / grades.size());
	      
		
	}
	
	//finds the lowest grade in ArrayList and removes grade
	//if lowest grade is in ArrayList multiple times then only 1 grade dropped
	public boolean dropLowest()
	{
		double result = grades.get(0);
	
		for (double number : grades) 
		{
            if (number < result) 
            {
                result = number;
            }
		
		
		}
		return grades.remove(result);
		
		
		
	}
	
	//adds the grade passed as parameter to the ArrayList to the END of list
	public void addGrade(double grade)
	{
		grades.add(grade);
	}
	
	//removes all grades that match parameter passed into method
	// returns true if grade found, false otherwise
	public boolean removeAllGrades(double grade)
	{
		for(int i=0; i<grades.size(); i++) 
		{
			if(grades.get(i)==grade) 
			{
				grades.remove(i);
				return true;
			}
			
		}
		return false;
		
		
	}
	
	//prints the grades in console window in sorted order (low to high)
	//can permanently change order of list
	public void printSortedGrades()
	{
		for(int j=0; j<grades.size()-1; j++)
		{
	        for(int i=0; i<grades.size()-1; i++)
	        {
	            if (grades.get(i) > grades.get(i+1))
	            		{
	                Double less = grades.get(i+1);
	                Double more = grades.get(i);
	                grades.remove(i);
	                grades.add(more);
	            		}
		
	        }
		}
	}
	
	
	//overrides the objects toString to display grades in ArrayList like
	//[34.0, 23.0, 10.5, 88.0, 23.0]
	@Override
	public String toString()
	{
		
		System.out.print("[");
		for(int i=0; i<grades.size(); i++)
		{
			System.out.print(grades.get(i)+", ");
			
		}
		System.out.print("]");
		return null;
		}
	
		
	}
	
		

	


