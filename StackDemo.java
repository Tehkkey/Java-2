import java.util.*;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<String> myStack = new Stack<>();
		myStack.push("Java");
		myStack.push("Love");
		myStack.push("I");
		
		
		
	    empty the stack
		while(!myStack.isEmpty())
		{
			System.out.print(myStack.pop()+" ");
		}
		
		// use a for loop to empty stack
		int size = myStack.size();	//save the original size of stack in separate variable v
		for(int i=0; i<size; i++)
		{
			System.out.println(myStack.pop());
		}

	}

}
