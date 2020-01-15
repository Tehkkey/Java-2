/*
 * Author: Kyle Sanchez
 * Date: 12/5/2019
 * Purpose: This program is supposed to represent a real life
 * game of Assassin using nodes
 * I finished everything and the graveyard works with a list of 6 names up until the game winning point
 * well, i just tested it again and it worked all the way through!.
 * 
 */

package AssassinManager;

import java.util.*;

public class AssassinManager {
	
	AssassinNode frontKill;
	AssassinNode frontGrave;
	
	/*
	 * 	This constructor should initialize a new assassin manager over the given list of people. Note that you
	 *  should not save the list parameter itself as a field, nor modify the list. Instead, you should build your
	 *  own kill ring of list nodes that contains these names in the same order using a deep copy.
	 *  If the list is null or empty, you should throw an IllegalArgumentException.
	 *
	 */
    public AssassinManager(List<String> names)
    {
    	if(names.size() == 0)
    		{
    		throw new IllegalArgumentException("No names in the list");
    		}
    	
    	for(int i=0; i<names.size();i++)
    	{
    		String name = names.get(i);
    		if (frontKill == null)
        	{
        		frontKill = new AssassinNode(name);
        	} else {
        		AssassinNode current = frontKill;
        		while(current.next != null) {
        			current = current.next;
        		}
        		current.next = new AssassinNode(name);
        	}
    		
    	}
    	
    }
    
    /*
     * This method should print the names of the people in the kill ring, one per line, indented by four
	 * spaces, as “X is stalking Y ”. If the game is over, then instead print “X won the game!”.
     */
    public void printKillRing()
    {
    	AssassinNode current = frontKill;
    	while (current != null) {
    		if(current.next == null)
    		{
    			System.out.println("    "+current.name+ " is stalking "+frontKill.name);
    		}else {
    			System.out.println("    "+current.name+ " is stalking "+current.next.name);
    		}
    		current = current.next;
    	}
    	
    	
    	
    }
    
    /*
     * This method should print the names of the people in the graveyard, one per line, with each line
		indented by four spaces, with output of the form “name was killed by name”. It should print the
		names in the opposite of the order in which they were killed (most recently killed first, then next more
		recently killed, and so on). It should produce no output if the graveyard is empty
     */
    public void printGraveyard()
    {
    	AssassinNode current = frontGrave;
    	while(current != null) 
    	{
    		System.out.println("    "+current.name+ " was killed by "+ current.killer);
        	current = current.next;
        	}
    	}
    
    
    /*
     * 	This method should return true if the given name is in the current kill ring and false otherwise. It
		should ignore case in comparing names; so, “salLY” should match a node with a name of “Sally”.
     */
    public boolean killRingContains(String name)
    {
    	
    	AssassinNode current = frontKill;
    	while (current != null) {
    		if(current.name.equalsIgnoreCase(name) == true)
    		{
    			return true;
    		}
    		current = current.next;
    		}
    	
    	return false;
    }
    

    	
    
    
    /*
     * 	This method should return true if the given name is in the current graveyard and false otherwise. It
		should ignore case in comparing names; so, “CaRoL” should match a node with a name of “Carol”.
     */
    public boolean graveyardContains(String name)
    {
    	AssassinNode current = frontGrave;
    	while (current != null) {
    		if(current.name.equalsIgnoreCase(name) == true)
    		{
    			return true;
    		}
    		current = current.next;
    		}
    	
    	return false;
    	
    }
 
  
     //This method should return true if the game is over (the kill ring has one person) and false otherwise
    
    public boolean isGameOver()
    {
    	if(frontKill.next == null)
    	{
    		return true;
    	}
    	return false;
    }
    
    
    //This method should return the name of the winner of the game, or null if the game is not over.
   
    public String winner()
    {
    	if(frontKill.next == null)
    	{
    		return frontKill.name;
    	}
    	return null;
    }
    
    /*
     * This method should record the assassination of the person with the given name, transferring the
		person from the kill ring to the front of the graveyard. This operation should not change the relative
		order of the kill ring (i.e. the links of who is killing whom should stay the same other than the person
		who is being killed). This method should ignore case in comparing names.
		A node remembers who killed the person in its killer field, and you must set the value of this field.
		You should throw an IllegalStateException if the game is over, or throw an
		IllegalArgumentException if the given name is not part of the kill ring. If both of these conditions are true, 
		the IllegalStateException takes precedence.
     */
    //if previous == null
    public void kill(String name)
    {
    	AssassinNode current = frontKill, prev = null; 
    	
    	while(current != null)
    	{
    		if(isGameOver() == true)
        	{
        		throw new IllegalStateException();
        	}
    		
    		if(isGameOver() == true && name.equalsIgnoreCase(current.name) == false)
        	{
        		throw new IllegalStateException();
        	}
            
            // If frontKill node itself holds the name to be deleted
    		//works if you pick the front node
            if (current != null && name.equalsIgnoreCase(current.name)==true) 
            { 
            	
            	//if currently at headNode
            	if(current == frontKill)
            	{
            		// find the last node to use for current.killer,
					// but how without another loop to get to end??????
            		current.killer = current.next.name;
            		frontKill=frontKill.next;
            		current.next = null;
                    
            		frontGrave = current;
            		return;
            	}
            	//if at any other node
            	if(current != frontKill)
            	{
            		current.killer = prev.name;
            		// Unlink the node from frontKill list 
            		current = prev.next;
            		prev.next = current.next;
            		current.next = null;
            	}
            	//if more than one in the graveyard
                if(frontGrave != null)
                {
                	// I was trying to figure out how to detach the frontgrave.next 
                	//and insert the current inbetween frontgrave and frontgrave.next
                	AssassinNode temp = current;
                	temp.next = frontGrave;
                	frontGrave = temp;
                	//current.next = null;
                	
                	
            	
                }
                //if no one is in the graveyard
                if(frontGrave == null)
                {
                	frontGrave = current;
                	current.next = null;
                }
                //frontKill = current.next; // Changed head
            	
                return; 
            } 
      
            // Search for the name to be deleted, keep track of the 
            // previous node, we need to change current.next 
            if(name.equalsIgnoreCase(current.name) == false) 
            { 
                prev = current;
                current = current.next;
            }
            
    		
    		
    	}
    }
    
    
    /*
     * Each AssassinNode object represents a single node in a linked list
     * for a game of Assassin.
     */
    
    
   
    private static class AssassinNode 
    {
        public final String name;  // this person's name
        public String killer;      // name of who killed this person (null if alive)
        public AssassinNode next;  // next node in the list (null if none)
        
        /**
         * Constructs a new node to store the given name and no next node.
         */
        public AssassinNode(String name) 
        {
            this(name, null);
        }

        /**
         * Constructs a new node to store the given name and a reference
         * to the given next node.
         */
        public AssassinNode(String name, AssassinNode next)
        {
            this.name = name;
            this.killer = null;
            this.next = next;
        }
    }
}