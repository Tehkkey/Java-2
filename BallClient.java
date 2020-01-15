import java.util.*;
import java.awt.Color;

public class BallClient
{

    public static void main(String[] args)
    {
    
        // construct a Queue of Ball objects
    	Queue<Ball> ballQueue = new LinkedList<>();
        
        
        // Add some colored Balls to it (Black, Red, Green, Green, Red, Green, Black)
        ballQueue.add(new Ball());
        ballQueue.add(new Ball(Color.RED));
        ballQueue.add(new Ball(Color.GREEN));
        ballQueue.add(new Ball(Color.GREEN));
        ballQueue.add(new Ball(Color.RED));
        ballQueue.add(new Ball(Color.GREEN));
        ballQueue.add(new Ball());
        
        System.out.println(ballQueue); // toString for linkedList
        								// which calls the balls toString
        
        
    	
        
        
        // Create an Iterator and remove the Green Balls
        Iterator<Ball> it = ballQueue.iterator();
        
        while(it.hasNext())
        {
        	Ball ball = it.next();
        	if (ball.getColor() == Color.GREEN)
        	{
        		it.remove();
        	}
        }
        System.out.println(ballQueue);
        
        
        
        
        // Call the LinkedList's toString to see contents of Queue
        
        
        // Construct a BallManager Object passing in the 
        // queue that now contains no Green Balls
        BallManager ballManager = new BallManager(ballQueue);
        System.out.println("Ball Manager "+ballManager);
        System.out.println("Ball Queue "+ballQueue);
        
        // change the ballQueue
        Ball firstItem = ballQueue.remove();
        
        System.out.println("After Ball Manager "+ballManager);
        System.out.println("After Ball Queue "+ballQueue);
        
        // Ask the Ball Manager to remove all Red Balls
        
        
        
        
        // Print out the Ball's Manager queue
    
    
    
    
    }
    
}
