import java.util.*;


public class JavaLinkedListClient
{
	public static void main ( String[] args )
	{
	   JavaLinkedList test = new JavaLinkedList(new int[]{4,5,6,7,8,9,10,11,12,13});
      // TODO: Add calls to test out calcAverage()  calcSum() findLargest() findSmallest()
		System.out.println(test);
		System.out.println("SUM : "+test.calcSum());
		System.out.println("AVERAGE : "+test.calcAverage());
		System.out.println("SMALLEST : "+test.findSmallest());
		System.out.println("LARGEST : "+test.findLargest());

		test = new JavaLinkedList(new int[]{24,75,86,37,82,94,111,82,43});
      // TODO: Add calls to test out calcAverage()  calcSum() findLargest() findSmallest()

		System.out.println(test);
		System.out.println("SUM : "+test.calcSum());
		System.out.println("AVERAGE : "+test.calcAverage());
		System.out.println("SMALLEST : "+test.findSmallest());
		System.out.println("LARGEST : "+test.findLargest());

		test = new JavaLinkedList(new int[]{0,4,5,2,1,4,6});
      // TODO: Add calls to test out calcAverage()  calcSum() findLargest() findSmallest()

		System.out.println(test);
		System.out.println("SUM : "+test.calcSum());
		System.out.println("AVERAGE : "+test.calcAverage());
		System.out.println("SMALLEST : "+test.findSmallest());
		System.out.println("LARGEST : "+test.findLargest());
	}
}