import java.util.*;

public class Kennel
{
   private ArrayList<Dog> kennel; // null
   
   // parameterized constructor
   public Kennel(int dogs)
   {
   
   //construct the kennel ArrayList
   kennel = new ArrayList<>();
   for(int i=0; i<dogs; i++)
   {
      kennel.add(new Dog());
   
   }
   
   }


}