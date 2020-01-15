import java.util.*;

public class DogClient extends Object
{
   public static void main(String[] args)
   {
      Dog d1 = new Dog('M', "lab", 88.5, "Fido", true);
      Dog d2 = new Dog('F', "St. Bernard", 100, "Jasmine", false);
      Dog d3 = new Dog('M', "Beagle", 40.5, "Bucky", true);
      List<Dog> list= new ArrayList<>();
      list.add(d1);
      list.add(d2);
      list.add(d3);
      
      // print out list before we sort
      System.out.println("Before sort: "+list);
      Collections.sort(list); // calls compareto we wrote in dog class
      System.out.println("After sort: "+list);
   }
}
   