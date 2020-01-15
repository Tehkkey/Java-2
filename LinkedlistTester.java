import java.util.*;

public class LinkedlistTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> list = new LinkedList<>();
		list.add("Java");
		list.add("can be");
		list.add("tricky");
		System.out.println(list);
		
		//Call the queue interface remove() and print out the returned element
		System.out.println(list.remove());
		System.out.println(list);
		int index = 0;
		System.out.println(list.remove(index));
		System.out.println("After list.remove(index)" +list);
		
		ArrayList<String> aList = new ArrayList<>();
		doStuff(aList);
		doStuff(list);
		

	}
	
	public static void doStuff(Queue<String> list)
	{
		
	}

}
