/*
 * Kyle Sanchez
 * This class implements GrocerList Interface and
 * uses the GroceryItem Class
 * 11/15/2019
 * 
 */

public class GroceryStore implements GroceryList
{
    
       private GroceryItem front;
       private int size;
       
       public GroceryStore()
       {
           front=null;
           size = 0;
       }
    
       /* Add the implementation for the GroceryList Interface methods below */
       public int size()
       { 
    	   return size; 
       }

       public GroceryItem get(int index) 
       { 
    	   return nodeAt(index); 
       }

       public void set(int index, GroceryItem value) 
       { 
    	   	if(front != null)
   			{
   			GroceryItem current = front;
   			for(int i=0; i <=index; i++)
   			{
   			current = current.next;
   			} // end of for
   			current = value; 
   			} // end of if
       }

       public String toString()
       { 
    	   if(front == null)
    		   return "[ ]";
    	   String result = "[" + front.name+" "+"$"+front.price;
    	   GroceryItem current = front.next;
    	   while (current != null)
    	   {
    		   result += ", " + current.name+" "+"$"+current.price;
    		   current = current.next;
    	   }
    	   // current == null here
    	   result += "]";
    	   return result; 
       }
       // returns the position of the fist occurrence of the given
       // value (-1 if not found)
       public int indexOf(GroceryItem value)
       { 
    	    int index = 0;
   			GroceryItem current = front;
   			while (current != null)
         {
   			if (current == value) 
   				return index;	
   			index++;
   			current = current.next;
   		}
    	   return -1; 
       }
       // appends value to the end of the list
       public void add(GroceryItem value)
       {  
    	   if (front == null)
    	      {
    				front = value;
    			} else
    	      {
    				GroceryItem current = front;
    				while (current.next != null)
    	         {
    					current = current.next;
    				}
    	         // current is on last node here
    				current.next = value;
    	         //System.out.println("add("+value+"):"+current);
    			}
    	      size++;
    		}
       
       // inserts the value of grocery item at specific index
       public void add(int index, GroceryItem value) 
       {  
    	   if (index == 0)
    	      {
    	         // reset front to point to new node and next to point to "former" front
    	         // add(0,2)
    	         // front --> 5 --> 6 -->null   (before)
    				front = value;
    				System.out.println("add("+index+", "+value+"):"+front);
    	         // front --> 2 --> 5 --> 6 --> null (after)
    			} else
    	      {
    	         // place the current at the node BEFORE where you need to add 
    	         // add(2,3)
    	         // front --> 5 --> 2 --> 6 --> null      
    	         //                 ^
    	         //                 |
    	         // current --------|      
    				GroceryItem current = nodeAt(index - 1);
    				current.next = value;
    				//System.out.println("add("+index+", "+value+"):"+current.next);
    	         // front --> 5 --> 2 --> 3 --> 6 --> null (after)
    			}
    	      size++;
       }

       public void remove(int index) 
       {   
    	   if(front != null)
   		{
   			if(index == 0)
   			{
   				front = front.next;
   			} else
   			{
   				//make use of nodeAt
   				// stop at node before the one to remove
   				GroceryItem current = nodeAt(index-1);
   				current = current.next.next;
   			}
   			size--;
   		}
       }
       
       //helper method...
       private GroceryItem nodeAt(int index)
       {
    		GroceryItem current = front;
    		for (int i = 0; i < index; i++) 
          {
    			current = current.next;
    		}
    		return current;
    	}

}