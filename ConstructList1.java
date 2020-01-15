/*Kyle Sanchez
 * 
 */ 


public class ConstructList1 {

	public static void main(String[] args) 
	{
		ListNode list = new ListNode();
		list.data = 10;
		list.next = new ListNode();
		list.next.data = 20;
		list.next.next = new ListNode();
		list.next.next.data = 30;
		System.out.println(list.data + " " + list.next.data +
		" " +	list.next.next.data);

	}

}
