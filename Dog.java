/*
 *This class will represent a dog
 *
 *
 */
 public class Dog implements Comparable<Dog> // could leave off implied extends object
  {
      private char gender; // '\0000' default
      private String name; //null default
      private double weight; // 0.0 default
      private boolean rabiesVaccine; // false default
      private String breed;
      
      
      // default constructor - zero parameters
      public Dog()
      {
         this('M', "Beagle", 40.5, "Bucky", true);
      
      }
      
      public int compareTo(Dog other)
      {
         if(this.weight > other.weight)
         {
            return 1;
         }else if (this.weight > other.weight)
         {
            return -1;
         }else // if dogs weight are equal
         {
         return 0;
         }
      }
      
      //setter or mutator
      public void setWeight(double w)
      {
         this.weight = w;
      
      }
      public void setGender(char g)
      {
         this.gender = g;
      }
      //getter or accessor
      public boolean getRabiesVaccine()
      {
         return this.rabiesVaccine;
      }
      public char getGender()
      {
         return this.gender;
      }
      
      public Dog(char gender, String breed, double weight, String name, boolean vac)
      {
         this.gender = gender;
         this.breed = breed;
         this.weight = weight;
         this.name = name;
         this.rabiesVaccine = vac;
      
      }
      
      
      // overriding the Object's toString
      @Override
      public String toString()
      {
         String result = "";
         result += name + " ";
         result += breed + " ";
         result += gender + " ";
         result += weight + " ";
         result += rabiesVaccine;
         return result;
      
      }
      
      // tester stub
      // static means only one
      public static void main(String[] args)
      {
       //construct a dog / instantiate a dog object
       /*Dog dog1 = new Dog();
       System.out.println(dog1.toString());
       
       dog1.setWeight(51.0);
       // call toString
       //println auto calls toString
       System.out.println(dog1);
       
       //change bucky to female
       dog1.setGender('F');
       //print out new gender
       System.out.println(dog1.getGender());
       */
      
      }// end of main method
      
 
  } // end of class
  
  
  
  