import java.util.Stack;

public class StackTestClient
{
	public static void main ( String[] args )
	{
		StackTester test = new StackTester("a,b,c,d,e,f,g,h,i");
		System.out.println(test);
      System.out.println("\npopping all items from the stack");
		System.out.println(test.popEmAll());

		StackTester test2 = new StackTester("1,2,3,4,5,6,7,8,9,10");
		System.out.println(test2);
      System.out.println("\npopping all items from the stack");
		System.out.println(test2.popEmAll());

		StackTester test3 = new StackTester("#,$,%,^,*,(,),),_");
		System.out.println(test3);
      System.out.println("\npopping all items from the stack");
		System.out.println(test3.popEmAll());
	}
}