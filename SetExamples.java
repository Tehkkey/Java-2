import java.util.*;


public class SetExamples {

	public static void main(String[] args) {
		
		//construct a TreeSet
		String[] words = {"ada","cat","fruit","frog","even"};
		
		Set<String> treeSet = new TreeSet<>(Arrays.asList(words));
		//print contents of treeSet
		System.out.println(treeSet);
		
		removeOddLength(treeSet);
		
		//print out the contents after the remove
		System.out.println(treeSet);
		
		//create new hashSet
		Set<String> hashSet = new HashSet<>(Arrays.asList(words));
		 
		//print contents
		System.out.println(hashSet);
		
		//call removeOddLength
		removeOddLength(hashSet);
		
		//print contents
		System.out.println(hashSet);
		

	}
	
	public static void removeOddLength(Set<String> set)
	{
		// create an iterator so we loop through the set and remove items
		// without worrying about indices
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			String word = it.next();
			//if ada has an odd length
			if(word.length() %2 ==1)
			{
				it.remove();
			}
		}
			
		
	}

}
