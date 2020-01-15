/*Kyle Sanchez
 * 
 */


public class ConstructList3 {

	public static void main(String[] args) {
		
		ListNode list = new ListNode();
		list.data = 10;
		list.next = new ListNode();
		list.next.data = 20;
		list.next.next = new ListNode();
		list.next.next.data = 30;
		ListNode list2 = new ListNode();
		list2.data = 40;
		
		System.out.println(list.data + " "+list.next.data +
				" "+list.next.next.data);
		System.out.println(list2.data);
	}

}
