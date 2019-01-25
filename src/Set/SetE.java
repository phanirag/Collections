
package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetE {

	public static void main(String[] args) {
		//hashSetE(); // isertion order in not preserd, duplicatis are not allowed 
		//linkdhassetE();// isertion order in preserd, duplicatis are not allowed 
		//treeSetE(); 
		//customizedSortingOrder();
		NavigableSetE();
	}

	private static void NavigableSetE() {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);//[1000, 2000, 3000, 4000, 5000]
		System.out.println(t.ceiling(2000));//2000
		System.out.println(t.higher(2000));//3000
		System.out.println(t.floor(3000));//3000
		System.out.println(t.lower(3000));//2000
		System.out.println(t.pollFirst());//1000
		System.out.println(t.pollLast());//5000
		System.out.println(t.descendingSet());//[4000, 3000, 2000]
		System.out.println(t);//[2000, 3000, 4000]
	}

	private static void customizedSortingOrder() {
		/*
		 default sorting order : comparable (I) 
		 method : compareTo();
		 coustimized sorting order : comarable {I}
		 method : compare(object o1, object o2), equals();
		 */
		TreeSet t = new TreeSet(new MyCompare());
		t.add(100);
		t.add(101);
		t.add(103);
		t.add(102);
		t.add(110);
		t.add(111);
		System.out.println(t.toString());
	}

	private static void treeSetE() {
		TreeSet t = new TreeSet();
		t.add(100);
		t.add(101);
		t.add(103);
		t.add(102);
		t.add(110);
		t.add(111);
		System.out.println(t.toString());
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(110));
		System.out.println(t.tailSet(101));
		System.out.println(t.subSet(101, 110));
	}

	private static void linkdhassetE() {
		LinkedHashSet l = new LinkedHashSet();
		l.add(2);
		l.add("sada");
		l.add(null);
		l.add('s');
		System.out.println(l.toString());
	}

	private static void hashSetE() {
		HashSet h = new HashSet();
		h.add(2);
		h.add("sada");
		h.add('s');
		System.out.println(h.toString());
	}

}
