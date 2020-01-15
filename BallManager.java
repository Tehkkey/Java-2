import java.util.*;

public class BallManager
{

    private Queue<Ball> ballQueue;
    
    // The constructor takes in a Queue of Balls and makes a deep copy of this queue
    // so it is stored as in an instance variable/field with a SEPARATE memory address 
    // The separate memory address is needed so changes made to the bQueue OUTSIDE this 
    // class are not ALSO made to the ballQueue inside this class.  This would happen
    // if in the constructor you simply performed this assignment ballQueue = bQueue
    
    public BallManager(Queue<Ball> bQueue)
    {
        ballQueue = new LinkedList<>(bQueue);
    
    }
    
    // This method appends the Ball to the end of the queue
    public void add(Ball ball)
    {
    	ballQueue.add(ball);
    
    
    }
    
    // This method removes all occurrences of the Ball from the queue, if the Ball passed in is null
    // throw an IllegalArgumentException
    public void removeAll(Ball ball)
    {
    	if(ball == null)
    	{
    		throw new IllegalArgumentException("Ball parameter is null");
    	}
    	Iterator<Ball> it = ballQueue.iterator();
    	while(it.hasNext()) {
    		Ball ballFromQueue = it.next();
    		// is ballFromQueue the same as ball passed in?
    		if(ballFromQueue.equals(ball))
    		{
    			it.remove();
    		}
    	}
    
    }
    
    // This method returns a queue of Balls
    public Queue<Ball> getBalls()
    {
    	
       return ballQueue; // change this
    }
    
    // This method removes the first ball in the queue and 
    // returns it
    public Ball removeBall()
    {
       return ballQueue.remove();
    }
    
    public String toString()
    {
       return "Ball Queue: " + ballQueue;
    }
    
      
}
