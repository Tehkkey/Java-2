import java.awt.Color;

public class Ball 
{
   // instance variable indicates color of ball
   private Color color; 
   
   // default constructor - constructs a black ball
   public Ball()
   {
      this(Color.BLACK);
   }
   
   // parameterized constructor - constructs a ball with
   // the color passed to it
   public Ball(Color color)
   {
      this.color = color;
   }
   
   // return's the ball color
   public Color getColor()
   {
      return this.color;
   }
   
   // returns the state of the Ball object as a string
   public String toString()
   {      
      return "Ball's color is: " + this.color;
   }

}