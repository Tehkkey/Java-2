/*
 * Kyle Sanchez
 * Midterm Fix It
 */
public class Toy implements Comparable<Toy>
{
	private String name; // name of the toy
	private int count; // inventory count

   // Parameterized constructor that instantiates a Toy with the given name and sets the count to 1
	public Toy( String name )
	{
		this.name = name;
		this.count = 1;
	}
	//toy1.compareTo(toy2)
	//this.compareTo(other)
	// sort by count
	//return 0 if the counts are the same
	// return < 0 if this.count < other.count
	// return > 0 if this.count > other.count
	public int compareTo(Toy other)
	{
		return this.count - other.count;
		
	}
   //Instance variable storing the inventory count for this particular toy
   public int getCount()
	{
		return count;
	}
	
   //Mutator method that will set the inventory count for the toy
	public void setCount( int count )
	{
		this.count = count;		
	}
	
   // Accessor method that returns the name of this particular Toy in the store
	public String getName()
	{
		return this.name;
	}
	
   // Overrides the Object’s toString() method to return the state of the toy like
   // "Toy: Baseball Count: 1"
	public String toString()
	{
	   return "Toy:" + name + " Count " + count;
	}
}