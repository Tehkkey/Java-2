import java.util.*;
// It is easy to go out of bounds when using arrays and arraylists
// Remember i is the index and  arr[i] or list.get(i) is the element
//
//ArrayList methods:
//list.remove(i);     --remove the ith value (indices change)
//list.add(value);    --appends a value at the end of list
//list.add(i, value); --inserts at an index (indices change)
//list.set(i, value); --overwrites the value at an index
//list.clear()        --remove all values
//list.contains(x)    --returns T/F if x is in the list
//list.toString()     --returns list as bracket delimited String
//list.equals(list2)  --returns T/F if arrays contain same values in same order
//Collections.sort(list) -- arranges elements in increasing order
//Collections.fill(list,value) -- populates list with the value

public class ArrayListDemo {

	public static void main(String[] args) {     
		
		// create ArrayList with 6 integer elements 1,1,2,4,4,5	 	
    /*  ArrayList<Integer> list = createArrayList();
      
      System.out.println(list);
      // sort the list
      Collections.sort(list);
      // print out list
      System.out.println(list);

		// Can we increment each arraylist element by one 
      // YES :)
		// ArrayList is an object PASSED BY REFERENCE
		incrementArrayList(list);
		//System.out.print(list.get(0) + ", " + list.get(1) + ", " + list.get(2));
		System.out.println("Before "+list.toString());
      // call countNeg(list) return count of negative #-s
      
      //System.out.println("Number of negatives: "+count);
    */
    ArrayList<String> list = new ArrayList<>();
      list.add("four");
      list.add("score");
      list.add("and");
      list.add("seven");
      list.add("years");
      list.add("ago");
      
      removeShorterStrings(list);
      System.out.println(list);
      
    /*  // remove duplicate numbers from list
      for(int i=0; i<= list.size() -1; i++){
         int current = list.get(i);
         int next = list.get(i+1);
         if( current == next){
            list.remove(i);
            i--;  
         }
         
      }
      
      */
      
      
      
	}
	
	
   
   


	
	
	// add one to each number in the ArrayList
	public static void incrementArrayList(ArrayList<Integer> list) {
      for(int i=0; i<= list.size() -1; i++){
         int element = list.get(i);
         element += 1;
         list.set(i, element);
      
      }
	}

public static void removeShorterStrings(ArrayList<String> list){
   for(int i=1; i<=list.size();i++){
   String current = list.get(i);
   String previous = list.get(i-1);
   if(current.length() < previous.length()){
   list.remove(i);
   }
   
   
   }
   }
   }
   
   

	
	
	// returns a count of the negative numbers in the ArrayList
	/*public static int countNeg(ArrayList<Integer> list) {
      // if number in list is less than zero add one to count
      int count = 0;
      for(int i=0; i<=list.size()-1; i++){
      //if number in list is < 0, add 1 to the count
      if(list.get(i) <0){
      counter ++;
      }
      }
      return 0;
	}
	*/
	

	

	// returns the smallest value in the Array List
	/*public static int findMin(ArrayList<Integer> list) {
		return 0;
	}
*/
   

