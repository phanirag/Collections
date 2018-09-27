package List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/* VECTOR
 * DataStructure : Growable Array
 * Insertion Order: Yes
 * Duplicates : Yes
 * Null Insertion : Yes
 * Heterogeneous : Yes
 * Serializable and Cloneable and 
 * Implements Random Access(Markable Interface)
 * It is synchronized so it is thread safe and Low in performance.
 * initial Capacity : 10
 * next Capacity : 2 * Current Capacity.
 * */
public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String> a=new Vector<String>();
		Vector<String> a1=new Vector<String>(20);
		Vector<String> a2=new Vector<String>(30,5);
		System.out.println(a.capacity());// 10
		System.out.println(a1.capacity());// 20
		a.add("hari");
		a.add("hari");
		a.add(null);
		a.add(null);
		System.out.println(a);//[hari, hari, null, null]

	}
}
