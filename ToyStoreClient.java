import java.util.*;

public class ToyStoreClient
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		store.loadToys("Baseball SoccerBall Barbie Barbie Slinky Jenga Jenga Bicycle Bicycle Jenga" );
		System.out.println( store );	
      System.out.println( );
			
      // Extra Credit
      System.out.println( "Toy most frequently bought:" + store.getMostFrequentToy() );
      System.out.println( );
      
      // Extra Credit
      store.sortToysByCount();
      System.out.println( "Toys sorted by count:" + store.toString());	
      System.out.println( );
    }
}