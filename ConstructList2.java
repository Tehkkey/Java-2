/*Kyle Sanchez
 * 
 */


public class ConstructList2 {

	public static void main(String[] args) {
		
		ListNode list = new ListNode();
		list.data = 30;
		list.next = new ListNode();
		list.next.data = 10;
		list.next.next = new ListNode();
		list.next.next.data = 20;
		System.out.println(list.data + " " + list.next.data +
				" "+ list.next.next.data);
		

	}

}
