package List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* LINKED LIST 
 * DataStructure : Double Linked List
 * Insertion Order: Yes
 * Duplicates : Yes
 * Null Insertion : Yes
 * Heterogeneous : Yes
 * Serializable and Cloneable
 * Used for Add and Delete Operations.
 * Not synchronized so it is not thread safe and High in performance.
 * */
public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> a=new LinkedList<String>();
		a.add("hari");
		a.add("hari");
		a.add(null);
		a.add(null);
		System.out.println(a);//[hari, hari, null, null]
		List<String> a1= Collections.synchronizedList(a); // Now ArrayList is synchronized

	}
}
