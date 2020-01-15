/*Kyle Sanchez
 * 
 */

public class ConstructList0
{

    public static void main(String[] args)
    {
        ListNode list = new ListNode(); // list --> 0 --> null
        list.data = 42;                 // list --> 42 -->  null
        list.next = new ListNode();     // list --> 42 --> 0 --> null
        list.next.data = 3;            // list --> 42 --> 3 null
        list.next.next = new ListNode(); //list --> 4 --> 3 --> 0 --> null
        list.next.next.data = 17; //list --> 42 --> 3 --> 17 --> null
        System.out.println(list.data + " " + list.next.data
                           +  " " + list.next.next.data);
        // 42 3 17
 
    
    
    
    
    
    }





}