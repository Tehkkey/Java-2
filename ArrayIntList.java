
public class ArrayIntList 
{
		//instance variables
		private int[] elementData;	//null initial value
		private int size;
	
		// constructors initialized the instance variables
		//default constructor - zero parameter constructor
		public ArrayIntList()
		{
			elementData = new int[10];
			size = 0;
		}
		
		public void add(int index, int value)
		{
			//check if index is not valid
			if(index>size || index<0)
			{ 
				throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
			}
			for(int i=size-1; i>=index; i--)
			{
				
			}
			//step 2 assign value into correct index
			elementData[index]=value;
			//step 3 increment size
			size++;
		}
		
		public int remove(int index)
		{
			if(index>size || index<0)
			{ 
				throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
			}
			//save removed item
			int removedItem=elementData[index];
			
			//move item to the left
			for(int i=index; i<size; i++)
			{
				elementData[i]=elementData[i+1];
			}
			size--;
			return removedItem;
			
		}
		//append value to 
		public void add(int value)
		{
			elementData[size] = value;
			size++;
		}
	
		//getters
		//get method receives the index and returns the value
		//at that index
		public int get(int index)
		{
			return elementData[index];
		}
	
		//setters
	
		//other important behaviors add
	
		// toString
		public String toString()
		{
			if(size == 0)
			{
				return "[ ]";
			}
			
			String result = "[";
			for(int i =0; i < size -1; i++)
			{
				result += result + elementData[i] + ",";
				
			}
			return result + "]";
			// return "[
		}
	
}
