import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class WordRunner
{
    
	public static void main( String args[] ) throws FileNotFoundException {
        
        // set up to read in file
		  Scanner fileIn = new Scanner(new File("words.txt"));

        // create a list of words
        List<Word> list = new ArrayList<Word>();
        
        // add each word in file to list
        while(fileIn.hasNextLine()) {
            String w = fileIn.nextLine();
            list.add(new Word(w));
        }
        
        // sort words in arraylist 
        // this will automatically call your Word compareTo method
        Collections.sort(list);
        
        
        // print out each word in sorted order
        for(Word word : list) {
            System.out.println(word);
        }


	}
}
