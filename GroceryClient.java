/*
 * Kyle Sanchez
 * This class implements GrocerList Interface and
 * uses the GroceryItem Class
 * 11/15/2019
 * 
 */

public class GroceryClient {

	public static void main(String[] args) {
		
		GroceryStore list = new GroceryStore();
		
		list.add(new GroceryItem("coca-cola", 6.99));
		System.out.println(list);
		list.add(new GroceryItem("Pepsi", 5.99));
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		
		list.add(0, new GroceryItem("sunkist", 4.99));
		System.out.println(list);
		
		System.out.println(list.indexOf(new GroceryItem("sunkist", 4.99)));
		
		list.add(new GroceryItem("coca-cola", 6.99));
		list.remove(0);
		System.out.println(list);
		
		
		
		list.set(0, new GroceryItem("pepsi", 5.99));
		System.out.println(list);
	}

}
