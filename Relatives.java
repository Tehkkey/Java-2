
import java.util.*;


public class Relatives
{
   //  Map instance variable map
   private Map<String,Set<String>> map; //null

   // TODO: finish the constructor method which instantiates the map as aTreeMap
	public Relatives()
	{
		map = new TreeMap<>();
		
   }

   // precondition: line contains a personname and a relativename separated by a comma
   // ex. line = "Almas, Brian"
   // postcondition: the person(Almas) is placed into the map as a key and the relative(Brian) is added 
   // to the relative set for this person
	public void setPersonRelative(String line)
	{
      //TODO: Use the split method to break apart the person from his relative
      //For example: after the split method is called names[0] = "Almas"(person) and names[1] = "Brian" (relative)
         String[] names = line.split(","); 
         String person = names[0];
         String relative = names[1];
         Set<String> relatives = new TreeSet<>();
		// TODO: if the map does NOT contain the person(key) like "Almas"
         if(!map.containsKey(person)) 
         {
        	 
         
         //TODO: then create a new empty TreeSet for the person's relatives "so we can add "Brian"
		   
          //TODO: put the set into the map for this person
          map.put(person, relatives);
         }
      // TODO: outside the if, get the set of relatives for the person	 
           relatives = map.get(person);
      // TODO: add the relative to the set for this person
              relatives.add(relative);
		
                
      
   }	

   // TODO:  This method returns a String representation of the Set of relatives for the passed in
   // person.  For example, if "Dot" is passed in for the person, then you should create a return
   // string containing "Chuck,Fred,Jason,Tom"
	public String getRelatives( String person)
	{
     String result=""; // empty string
     Set<String> relatives = map.get(person);
     for(String relative :relatives)
     {
    	 result+=relative + ",";
     }
     // use substring method to cut off last comma
     return result.substring(0, result.length()-1);
   }

	// The toString() returns a string representation for the entire contents of the map
   // listing 
    public String toString()
	{
		String result="";
        // TODO:  for every person in the map keySet
		for(String person: map.keySet()) {
			
		
		         // TODO: add this person to the return string with a "is related to "
			result += person +" is related to " + getRelatives(person) + "\n";
               // TODO: call getRelatives and add relatives for this person to return string and add newline
		} 
                 
		// return the string representation for the entire contents of the map listing
      return result;
	}
}