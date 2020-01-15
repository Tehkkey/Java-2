/*
 * Kyle Sanchez
 * 11/26/2019
 * Recursive Exercises
 * 
 */
public class RecursiveExercises {

	public static void main(String[] args) {
		
		System.out.println("powerN "+ powerN(3, 3));
		System.out.println("bunnyEars "+bunnyEars(2));
		System.out.println("crazyBunnyEars "+crazyBunnyEars(4));
		System.out.println("sumDigits "+sumDigits(126));
		

	}
	
	public static int powerN(int base, int exponent)
	{
		if(exponent<1 || base <1)
		{
			throw new IllegalArgumentException();
		}
		//what is the base case?
		if(exponent == 1)
		{
			return base;
			
		}else
		{
			
			return (base * powerN(base, (exponent -1)));
		}
		
	}
	
	public static int bunnyEars(int numBunnies)
	{
		if (numBunnies < 0)
		{
			throw new IllegalArgumentException();
		}
	    //what is the base case?
		if(numBunnies == 0)
		{
			return numBunnies;
		}else	// how do you make the number of bunnies get smaller?
		{
			
			return 2 + bunnyEars(numBunnies -1);
		}
	        
		
	}
	
	public static int crazyBunnyEars(int bunnyIndex)
	{
		if (bunnyIndex < 0)
		{
			throw new IllegalArgumentException();
		}
	    //what is the base case?
		if(bunnyIndex == 0)
		{
			return bunnyIndex;
		}else if (bunnyIndex %2 ==0)	// how do you make the index of the bunnies get smaller?
		{
			
			return 2+ crazyBunnyEars(bunnyIndex-1);
		}else
		{
			return 3+ crazyBunnyEars(bunnyIndex-1);
		}
	        
		
	}
	
	public static int sumDigits(int number)
	{
		if (number < 0)
		{
			throw new IllegalArgumentException();
		}
	    //what is the base case?
		if (number == 0)
		{
			return number;
		}
		
		else
		{
	       // how do you make the number get smaller? 
			return (number %10)+sumDigits(number/10);
		}
	}

}
