import java.util.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

   // default constructor
	public PostFix()
	{
		//this automatically calls a constructor in this class
		// that matches perameters
      this("");
  	}

   // TODO: Parameterized constructor
   // @param exp - the PostFix expression that needs to be solved
	public PostFix(String exp)
	{
       stack = new Stack<>();
       expression = exp;
   }

   // TODO: This method receives two numbers and a math operator (*,-,+,/)
   // @param one - first number
   // @param two - second number
   // @param char - math operator * - + /
   // @return the calculated amount
	public double calc(double one, double two, char op)
	{
      double answer = 0.0;
      switch(op)
      {
      	case'*':
    		  answer = one *two;
    		  break;
    		  
      	case'+':
      		answer = one+two;
      		break;
      	case'-':
      		answer = one-two;
      		break;
      	case'/':
      		answer=one/two;
      		break;
      }
       
		return answer;
	}

   // TODO: This method performs all the math operations in the PostFix expression and
   // returns a String containing the original expression and the calculated answer
	public String solve()
	{
		//parse the expression into individual values (split)
		String[] items=expression.split(" ");
		// Debug Statement
		//System.out.println(Arrays.deepToString(items));
		
		if(items.length>1)
		{
			for(String item : items)
			{
				//if item is a digit, push it on stack
				if(Character.isDigit(item.charAt(0)) == true)
						{
							double num = Double.parseDouble(item);
							stack.push(num);
						}
				else // the value is an operator
				{
					double num2 =stack.pop();
					double num1 =stack.pop();
					double answer = calc(num1, num2, item.charAt(0));
					stack.push(answer);
				}
			}
			return expression+ " = " + stack.peek();
			
			
		}
        return "No calculations performed, no items";
   }
   
	public String toString()
   {
       return "Expression: " +expression+", Stack: " + stack+"\n";
   }
}