/*
 * Kyle Sanchez
 * Midterm Fix It
 */

import java.util.*;


public class ToyStore
{
   // TODO 
   // declare instance variable
   // Instance variable holding a list of all the toys.  
   // You choose whether you instantiate the store as an ArrayList<Toy> or a LinkedList<Toy>
		private List<Toy> store;
		
   //TODO
   //Default constructor constructs the store list.
   //The store list will have no toys in the list. (.size() returns 0)
	public ToyStore()
	{
			store = new ArrayList<Toy>();
	}

   // TODO
   // This method receives toy names in a string from the ToyStoreClient. 
   // Each toy is separated by a space. This method should split the string to 
   // individually identify each toy name.  The method will then call the findToy(toyName) 
   // method to see if the toy object with the passed in toyName is already in the store list. 
   // If a valid Toy object is already in the store list it will get the current count from the 
   // Toy object and increment it. If a valid Toy object is not in the store list, 
   // this method will create a new Toy object with the toyName and add it to the list.

	public void loadToys(String toys )
	{
		
		String[] stringArray = toys.split(" "); //split string by space
        // For every STRING toyName in the string array
        for (String toyName : stringArray)
        {    
                    Toy toy = findToy(toyName);
                    // TODO: What is wrong with this if statement???
                    // If TOY object is in the store list
                    if (toy != null && toy.getName().equals(toyName))
                    { 
                        int toyCount = toy.getCount();
                        toyCount++;
                        toy.setCount(toyCount);
                    } else 
                    {
                       // TODO: What is wrong here?
                       // no TOY objects exist for this toy name
                       // create a new Toy object and add to store
                    	
                       store.add(new Toy(toyName));
                    
                    }
        }
                 
              
                                
        }
/*
		String[] lines = toys.split(" ");
		
		for (int i = 0; i < lines.length; i++) {
			
			String name = lines[i];
			
			allToys.add(name);
			
			findToy(name);
		}
		//store.addAll(allToys);
		System.out.println(allToys);
		// i realize i created a separated linkedList instead of using the store list, i wasted
		// too much time trying to figure out how to utilize the store list inside this method
	}*/
	
  // TODO
  // This method will check if the toy is in the store list. It is called from the loadToys() method. 
  // If toyName is in the store list,  this method will return the Toy object it found in the store list, 
  // otherwise it will return null.
        public Toy findToy( String toyName )
        {
           for (Toy toy : store) { //loop through the toy store
              if(toy.getName().equals(toyName)) //if a match from the passed parameter is found
                 return toy; //return the toy Object
           }
           return null; //if you land outside the loop, that means no TOY object was found in the store list , return null
        }
  
  // EXTRA CREDIT METHOD
  // This method will traverse the store list and return the toyName for the Toy object that 
  // has the highest inventory count.
  public String getMostFrequentToy()
  {
	  int maxCount = -1;
	  String maxName="";
	  // TO DO
	  for(Toy toy: store)
	  {
		  if(toy.getCount() > maxCount)
		  {
			  maxName = toy.getName();
			  maxCount = toy.getCount();
		  }
	  }
	return maxName;
     
  }
  
  // EXTRA CREDIT METHOD
  // This method will sort the store list by calling the Collections.sort(store) method.
  // This requires the Toy class implement the Comparable<Toy> interface (i.e. the compareTo(Toy other) method)
  public void sortToysByCount()
  {  	
      Collections.sort(store);
  }
  
  // FINISHED
  // This method returns a string representation of the store list
	public String toString()
	{
	   return store.toString();
	}
}