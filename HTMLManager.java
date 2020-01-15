/*
 * Kyle Sanchez
 * 10/29/2019
 * This program is incomplete but is supposed to be an HTML validator
 * 
 */

import java.util.*;

public class HTMLManager
{
	private Queue<HTMLTag> page;
    // TODO
    public HTMLManager(Queue<HTMLTag> page)
    {
    	
    	
    	if(page == null)
    	{
    		throw new IllegalArgumentException("Queue is null");
    	}
    	page = new LinkedList<>();
    	
    
    }
    
    //TODO
    public void add(HTMLTag tag)
    {
    	if(tag == null)
    	{
    		throw new IllegalArgumentException("tag is null");
    	}
    	page.add(tag);
    
    
    }
    
    // TODO
    public void removeAll(HTMLTag tag)
    {
    	if(tag == null)
    	{
    		throw new IllegalArgumentException("tag is null");
    	}
    	for(HTMLTag item: page)
    	{
    		if(tag == item)
    		{
    			page.remove();
    		}
    	}
    	/*Iterator<HTMLTag> it = page.iterator();
    	while (it.hasNext())
    	{
    		if(tag == it.next())
    		{
    			page.remove();
    		}
    	} */
    
    
    }
    
    //TODO
    public Queue<HTMLTag> getTags()
    {
    
       return page; // change this
    
    }
    
    //TODO - PseudoCode available in fixHTML.txt
    public void fixHTML()
    {
    	
    
    
    
    }
    
  
     
}
