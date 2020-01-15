/*
 * Kyle Sanchez

 * 10/29/2019
 * This program is incomplete but is supposed to be an HTML validator
 * 
 */


// This testing program creates a queue of HTML tags 
// in a valid sequence.
// You may use this as a starting point for testing
// your removeAll tags method.
import java.util.*;

public class HTMLManagerTest {
	public static void main(String[] args) {
		// <p>Hi</p><br/>
		Queue<HTMLTag> tags = new LinkedList<HTMLTag>();
		tags.add(new HTMLTag("p", HTMLTagType.OPENING));      // <p>
		tags.add(new HTMLTag("p", HTMLTagType.CLOSING));     // </p>
		tags.add(new HTMLTag("br", HTMLTagType.SELF_CLOSING));           // <br>
		
		HTMLManager manager = new HTMLManager(tags);

		// Add calls to removeAll here to test whether your method works
		manager.removeAll(null);
		manager.getTags();
	}
}