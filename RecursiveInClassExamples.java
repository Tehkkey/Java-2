

public class RecursiveInClassExamples {
	// Rules of Recursion
	// A recursive method must have a base case (stopping condition)
	// A recursive method must call (invoke) itself
	// A recursive method must approach the base case
	// Note we do not want to use recursion to solve overlapping sub-problems like
	// finding fibonacci numbers

	public static void main(String[] args) {

		String[] array = { "Recursion", "is", "fun" };

		// 1. prints 5 4 3 2 1 recursively
		countDownTo(100);
		System.out.println();
		
		//mystery 2
		mystery2(10);
		System.out.println();
		// 2. prints 1 2 3 4 5 recursively
		countUpTo(5);
		System.out.println();

		// 3. printArrayForward recursively "Recursion is fun"
		printArrayForward(array, 0);
		System.out.println();

		// 4. printArrayReverse recursively "fun is Recursion"
		printArrayReverse(array, 0);
		System.out.println();

		// 5. factorial(5) = 120
		System.out.println("5! = " + factorial(5));

		// 6. print fibonacci sequence 0 1 1 2 3 5 8 13
		System.out.println(
				fib(0) + " " + fib(1) + " " + fib(2) + " " + fib(3) + " " + fib(4) + " " + fib(5) + " " + fib(6));

		// 7. Find fibonacci(40) recursively
		long start = System.currentTimeMillis();
		System.out.println(fib(40) + " elasped time: " + (System.currentTimeMillis() - start));

		// 8. Find fibonacci(40) iteratively
		start = System.currentTimeMillis();
		System.out.println(fibIterative(40) + " elasped time: " + (System.currentTimeMillis() - start));

		// 9. starString(3) = "********" 2^3 = 8 stars returned
		System.out.println(starString(0));
		System.out.println(starString(1));
		System.out.println(starString(2));
		System.out.println(starString(3));
		System.out.println(starString(4));
		
	}
	public static void mystery2(int n) {
	    if (n > 100) {
	        System.out.print(n);
	    } else {
	        mystery2(2 * n);
	        System.out.print(", " + n);
	    }
	}
	// print the numbers from n down to 1 recursively
	//countDownTo(5)
	public static void countDownTo(int n) {
		if(n<= 1)
		{
			System.out.print(" "+n);
		}else {
			countDownTo(n/2);
			System.out.print(", "+n);
		
		}
	}

	// print the numbers from 1 up to n recursively
	//countUpTo(5) print 1 2 3 4 5 
	public static void countUpTo(int n) {
		// What is the base case?
		if(n == 1)
		{
			System.out.print(" "+n);
		}else 
		{
			countUpTo(n-1);
			System.out.print(" "+n);
		}

	}

	// given an array ["Recursion","is","fun"] this method will print out "Recursion
	// is fun" printArrayForward(array, 0)
	public static void printArrayForward(String[] array, int index) {
		// what is the base case?
		if(index == array.length-1)
		{
			System.out.print(array[index]);
		}else
		{
			System.out.print(array[index]);
			printArrayForward(array, index+1);
		}
		

	}

	// given an array ["Recursion","is","fun"] this method will print out "fun is
	// Recursion"
	public static void printArrayReverse(String[] array, int index) {
		// what is the base case?
		if (index == array.length-1)
		{
			System.out.print(array[index]);
		}else
		{
			printArrayReverse(array, index+1);
			System.out.print(array[index]);
		}

	}

	// recursive method with a return type
	// factorials 3! = 3 * 2 * 1 = 6
	// 0! = 1 1! = 1 2! = 2 3! = 6 4! = 24 5! = 120
	// factorial(5) return 120 to main 
	public static int factorial(int n) {
		// what is the base case?
		if(n == 1)
			return n;
		else
			return n * factorial(n-1);
		

	}
	// fibonacci numbers
	// 0 1 1 2 3 5 8 13 21 34
	// First two fibonacci numbers are 0 and 1 by definition
	// then the rest are calculated by the sum of the previous two
	// This one has two base cases n==0 and n==1
	// fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

	public static int fib(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		// what are the base cases?
		if(n == 0) {
			
			return 0;
		}
			else if(n == 1) {
				return 1;
			}
		else
			return fib(n-1) + fib(n-2);
			
	}

	// 0 1 1 2 3 5 8 fibonacci(num)
	// 0 1 2 3 4 5 6 num

	public static int fibIterative(int num) {
		if (num == 0)
			return 0;

		if (num == 1)
			return 1;

		int[] nums = new int[num + 1];
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2; i <= num; i++) {

			nums[i] = nums[i - 1] + nums[i - 2];

		}
		return nums[num];

	}

	// Write a method starString that accepts an integer parameter n and returns a
	// string of stars(*) 2^n log
	// Example: Returns
	// starString(0) "*" 2^0=1
	// starString(1) "**" 2^1=2
	// starString(2) "****" 2^2=4
	// starString(3) "********" 2^3=8
	// starString(4) "****************" 2^4=16
	// throw an IllegalArgumentException if n < 0
	public static String starString(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		// What is base case?
		if(n == 0)
			return "*";
		else
			return starString(n-1) + starString(n-1);

	}

}
