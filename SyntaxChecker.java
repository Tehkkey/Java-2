/*
 * Kyle Sanchez
 * 10/22/2019
 * This program takes a given expression variable and checks if there are matching opening and closing
 * symbols based on the index of the open and close strings
 * I didn't give up and I finally figured it out.
 */


import java.util.*;

public class SyntaxChecker {

	private String expression; // expression to validate
   private Stack<String> stack; // holds opening symbols ONLY
	private String open; // opening symbols
	private String close; // closing symbols

   // TODO: initialize the instance variables expression, stack, open, close
 	public SyntaxChecker(String open, String close, String exp) 
   {
 		stack = new Stack<>();
 		this.open = open;
 		this.close = close;
 		this.expression = exp;
 		 
	}

	// TODO complete the checkExpressions method that determines if the expression
	// has a closing symbol for every opening symbol
   // @return true if the expression is valid, false otherwise
	public boolean checkExpression()
   {
		
		for(char i:expression.toCharArray())
		{
			String c = i+"";
			if (open.indexOf(c) != -1)
			{
				
				
				stack.push(c);
			}
			else if (close.indexOf(c) != -1)
			{
				if (stack.isEmpty() == true)
				{
					return false;
				}
				String p = stack.pop();
				if(open.indexOf(p) != close.indexOf(c))
				{
					return false;
				}
				
				
			}
		}
		
   		if(stack.isEmpty()==true);
   		{
   			return true;
   		}
   	
	}


   // This method calls the checkExpression method and will determine if the 
   // expression is valid (every opening symbol, has a closing symbol)
   // A string is return with a validation message 
   // @return a validation message
   public String validate()
   {
      String result="";
      
      if (checkExpression()==true)
				result += expression + " is correct\n";
		else
				result += expression + " is incorrect\n";
		
		return result;
   }
   
   
	public String toString()
   {
		return "Expression: " + expression + "\nStack: " + stack + "\nOpen: " + open + "Close: " + close;
	}

}
