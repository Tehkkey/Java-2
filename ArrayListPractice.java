import java.util.ArrayList;

public class ArrayListPractice
{
   public static void main(String[] args)
   {
      // declare an ArrayList to hold Strings
      ArrayList<String> animals = new ArrayList<>();  // created 10 null contiguous pieces of memory
      // call toString
      System.out.println(animals);
      // Add 4 animals named animal1, animal2, animal3, animal4
      //["animal1",]
      for(int i=1; i<=4; i++)
      {
         animals.add("animal"+i);
      }
      System.out.println(animals);
      // overwrite animal2 with animal99
      animals.set(1, "animal99");
      System.out.println(animals);
      // index out of bounds test  animals.set(10,"abe");
      
      //Find the animal that goes with "animal88"
      System.out.println(animals.indexOf("animal88"));
      
      createDogArrayList();
   
   
   }
   
   public static void createDogArrayList()
   {
      ArrayList<Dog> animals = new ArrayList<>();
      
      //add dog object to ArrayList
      // Step 1; create a dog object
      Dog dog1 = new Dog();
      // step 2: add dog1 object to arraylist
      animals.add(dog1);
      System.out.println(animals);
      
      animals.add(new Dog('F', "Chihuahua Mix",30.5, "Kora", true ));
      System.out.println(animals);
   
   
   }



}
