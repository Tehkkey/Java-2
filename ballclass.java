import java.awt.Color;
/*
 *This class will represent a Ball
 * Kyle Sanchez
 * 9/26/2019
 */
 public class Ball 
  {
      private Color color; // '\0000' default
      
      
      
      // default constructor - zero parameters
      public Ball()
      {
         this(Color.BLACK);
      
      }
      public Ball(Color c)
      {
      this.color = c;
      }
      
      //setter or mutator
      public void setColor(Color c)
      {
         this.color = c;
      
      }
      
      //getter or accessor
      public String getColor()
      {
         return this.color;
      }
      
      public Ball(String color)
      {
         this.color = color;
      
      }
      
      
      // overriding the Object's toString
      @Override
      public String toString()
      {
         String result = "";
         System.out.println("Ball's color is:" + getColor);
         return result;
      
      }
      
     
      // static means only one
      public static void main(String[] args)
      {
       //construct a ball / instantiate a ball object
       Ball ball1 = new Ball();
       System.out.println(ball1.toString());
       
       
       // call toString
       //println auto calls toString
       System.out.println(ball1);
       
       //change color to black
       ball1.setColor(Color.BLACK);
       //print out new color
       System.out.println(ball1.getColor());
       
      
      }// end of main method
      
 
  } // end of class