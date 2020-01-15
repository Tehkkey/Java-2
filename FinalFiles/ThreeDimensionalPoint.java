/*
 * Kyle Sanchez
 * 12/12/2019 
 * 
 */

public class ThreeDimensionalPoint
{

    private int x;
    private int y;
    private int z;
    
    public ThreeDimensionalPoint(int x, int y, int z)
    {
       this.x = x;
       this.y = y;
       this.z = z;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }
    
    public void setX(int value) { this.x = value; }
    public void setY(int value) { this.y = value; }
    public void setZ(int value) { this.z = value; }
    
    public boolean equals(Object obj)
    {
       if (!(obj instanceof ThreeDimensionalPoint))
           return false;
           
       ThreeDimensionalPoint other = (ThreeDimensionalPoint) obj;
       
       return this.x == other.x && this.y == other.y && this.z == other.z;
        
    
    }
    
    public String toString()
    {
        return "[ x = "+x+", y = "+y+", z = "+z+" ]";
    
    }

	// figured out that i was passing in a generic object not a ThreeDimensionalPoint object so i couldn't do the getZ method on it and couldn't figure out why
    //until the end lol
	public int compareTo(ThreeDimensionalPoint other) {
		if(other.getZ() < this.z) 
		{
			return 1;
		}
		if(this.getX() < this.x) {
			return -1; 
		}else
		return 0;
	}
    
    

}