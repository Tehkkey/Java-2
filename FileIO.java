import java.util.*;
import java.io.*;

public class FileIO
{

    public static void main(String[] args) throws FileNotFoundException
    {
    
       Scanner console = new Scanner(System.in);
       System.out.print("Enter a directory/file name: ");
       String name = console.nextLine();
       File file = new File(name);
       // if the file does not exist
       if(!file.exists())
       {
          System.out.println("No such file/directory");
        } else
        {
          // if a file is entered print the contents          
          if(!file.isDirectory())
          {
            Scanner fileIn = new Scanner(file);

            // call read File methods
            System.out.println("Reading File Iteratively...");
            readFileIterative(fileIn);
   
         
            System.out.println("\n\n\n");
            // reset the fileIn reference back to the beginning of the file
            fileIn = new Scanner(file);
          
            System.out.println("Reading File Recursively...");
            readFileRecursive(fileIn);
          } else // a directory is entered
          {
            // call recursive crawl function
            int indentation_level = 0;
            crawl(file, indentation_level);
          }
         
        
        }

                 
    
    }
    
    /*
     * This method reads the file iteratively using a Scanner object
     * and prints the content
     */
    
    public static void readFileIterative(Scanner fileIn) 
    {
    	//while there is something in the file
    	while(fileIn.hasNextLine()) {
    		// read in the line of text into a variable
    		// named line
    		String line = fileIn.nextLine();
    		
    		System.out.println(line);
    	}
    	
    }
    /*
     * This method reads the file recursively, remember you will
     * replace the loop with a recursive call and you need an if statement
     */
    public static void readFileRecursive(Scanner fileIn)
    {
          // What is the base case? When would you stop reading the file?
          if(fileIn.hasNextLine())
          {
        	  String line = fileIn.nextLine();
        	  System.out.println(line);
        	  readFileRecursive(fileIn);
        	  //placing println after recursive call makes go in reverse
        	  //System.out.println(line);
          }
    
    
    
    }

    /*
     * Recursive crawl method that receives a File object and 
     * an indentation level and recurses through a directory structure
     * printing out the contents.  The method will only recurse if the file is a 
     * Directory. (the base case is NOT a  directory file)
     */
    public static void crawl(File file, int level)
    {
        // print out proper number of spaces for indentation level
        for(int i =0; i < level; i++)
        {
        	System.out.print("\t");
        }
        // print file/directory name
        System.out.println(file.getName());
        // if the file is a directory
        if(file.isDirectory())
        {
        	// for every file in the directory
        	for(File f : file.listFiles())
        	{
        		// call recursive crawl method with a level increase
        		crawl(f, level+1);
        	}
        }
           
                       
        
       // end if the is a directory      
    }


}