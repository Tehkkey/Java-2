/**
 * Kyle Sanchez
 * Eric Sanden
 * 10/07/2019
 * Pair Program- Comparable Interface
 * 
 */


import java.util.Arrays;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
        word = s;
        
	}

   // TO DO - complete the Compare To Method
	public int compareTo(Word other)
	{
		if(this.word.length() > other.word.length())
        {
           return 1;
        }else if (this.word.length() < other.word.length())
        {
           return -1;
        }else
        {
        	
        return this.word.compareTo(other.word);
        }
	}
       	

	public String toString()
	{
		return word;
	}
   
}
