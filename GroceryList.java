public interface GroceryList
{

    public int size();

    public GroceryItem get(int index);

    public void set(int index, GroceryItem value);

    public String toString();

    public int indexOf(GroceryItem value);

    public void add(GroceryItem value);

    public void add(int index,GroceryItem value);

    public void remove(int index);

}