public class GroceryItem {

        public String name;  // the name of the grocery item
        public double price;      // the price of the grocery item      
        public GroceryItem next;  // next node in the list (null if none)
        
        /**
         * Constructs a new node to store the given name, price,  and no next node.
         */
        public GroceryItem(String name, double price) {
            this(name, price, null);
        }

        /**
         * Constructs a new node to store the given name, price,  and a reference
         * to the given next node.
         */
        public GroceryItem(String name, double price, GroceryItem next) {
            this.name = name;
            this.price = price;
            this.next = next;
        }
        
        public String toString() {
            return name +" $"+ price;
        
        }
               
        
}
