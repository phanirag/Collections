package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* ARRAY LIST (1.2v)
 * DataStructure : Growing Array
 * Insertion Order: Yes
 * Duplicates : Yes
 * Null Insertion : Yes
 * Heterogeneous : Yes
 * Serializable and Cloneable
 * Implements Random Access(Markable Interface)
 * User for Retrival of data
 * Not synchronized so it is not thread safe and High in performance.
 * initial Capacity : 10
 * next Capacity : (Current Capacity + 3 / 2) + 1
 * */
public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("hari");
		a.add("hari");
		a.add(null);
		a.add(null);
		System.out.println(a);//[hari, hari, null, null]
		List<String> a1= Collections.synchronizedList(a); // Now ArrayList is synchronized


	}
}
