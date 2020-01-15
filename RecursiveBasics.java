/*
 * Kyle Sanchez
 * 12/12/2019 
 * 
 */

public class RecursiveBasics
{
    public static void main(String[] args)
    {
       //Problem 2
       System.out.println(holiday("Ho! ",3));
       System.out.println(holiday("Jingle Bells ",2));
       System.out.println(holiday("Snow",1));
       System.out.println(holiday("yum",0));

       // Problem 3
       System.out.println(multiplyOdds(1));
       System.out.println(multiplyOdds(2));
       System.out.println(multiplyOdds(3));
       System.out.println(multiplyOdds(4));
    }
    public static String holiday(String greeting, int num)
    {
    	if(num <0)
    	{
    		throw new IllegalArgumentException();
    	}
    	if(num == 0)
    	{
    		return "";
    	}
    	// base case
    	if( num == 1)
    	{
    		return greeting;
    	}
    	return greeting + holiday(greeting, num -1);
    	
    }
    
    public static int multiplyOdds(int n) {
	
    {
    	if (n < 0)
		{
			throw new IllegalArgumentException();
		}
	    //what is the base case?
		if(n == 1)
		{
			return n;
		}else
		{
			return multiplyOdds(n-1) * (n*2-1);	
		
		}
    }
    }
}