/**
 * Kyle Sanchez
 * 10/13/2019
 * StackTester.java
 * This class utilizes StackTestClient
 * to test looping through a string array and
 * pushing and popping the contents onto and off
 * stack
 * 
 */


import java.util.Stack;

public class StackTester
{
	private Stack<String> stack; // instance variable

   // Constructor - Create an empty stack
	public StackTester()
	{
		stack = new Stack<>();
	}

   // Parameterized Constructor 
   // @param - line is a String containing Stack Items
   // precondition - line is not null
   // postcondition - stack is created and initialized with all the comma separated values from the passed in
   // string
	public StackTester(String line)
	{
		stack = new Stack<>();
		String[] lines = line.split(",");
		
		for (int i = 0; i < lines.length; i++) {
			String s = lines[i];
			stack.push(s);
		}
				
		
		
		
			
	}
	
   // This method empties the stack and creates a String containing each item popped from the stack followed by a space
   // precondition - stack is not null
   // postcondition - stack is empty and string is returned containing all popped items
	public String popEmAll()
	{ 
		String result ="";
			
		while(!stack.isEmpty()) 
		{
			result += stack.pop() +" ";
		}
		return result;
	}

   // returns a string representation of the Stack contents
	public String toString()
	{    
		return ""+stack+"\n";
	}
}