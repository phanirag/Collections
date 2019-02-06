package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Optional;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapE {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//methodsInMap();
		//IdentityHashMapE();
		//WeakHashMapE();
		TreeMapwithdefaultSortingOrder();
		TreeMapwithCustomizedSortingOrder();
		//hashTableE();
		//navigableMapE();
		
	}


	private static void navigableMapE() {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("b","banana");
		t.put("c","cat");
		t.put("a","apple");
		t.put("d","dog");
		t.put("g","gun");
		System.out.println(t);//{a=apple, b=banana, c=cat, d=dog, g=gun}
		System.out.println(t.ceilingKey("c"));//c
		System.out.println(t.higherKey("e"));//g
		System.out.println(t.floorKey("e"));//d
		System.out.println(t.lowerKey("e"));//d
		System.out.println(t.pollFirstEntry());//a=apple
		System.out.println(t.pollLastEntry());//g=gun
		System.out.println(t.descendingMap());//{d=dog, c=cat, b=banana}
		System.out.println(t);//{b=banana, c=cat, d=dog}
	}


	private static void hashTableE() {
		Hashtable h = new Hashtable(); // insertion order in based on hashcode
		h.put(new Temp1(2), "hari");
		h.put(new Temp1(9), "Ram");
		System.out.println(h);
	}


	private static void TreeMapwithdefaultSortingOrder() {
		TreeMap t=new TreeMap();
		t.put("XXX",10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("LLL",40);
		System.out.println(t);//{AAA=20, LLL=40, XXX=10, ZZZ=30}
	}


	private static void TreeMapwithCustomizedSortingOrder() {

		TreeMap t=new TreeMap(new MyComparator());
		t.put("XXX",10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("LLL",40);
		System.out.println(t);//{ZZZ=30, XXX=10, LLL=40, AAA=20}
	}


	private static void WeakHashMapE() throws InterruptedException {
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "bhaskar");
		System.out.println(m);// {Temp=bhaskar}
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);// {}
	}


	private static void IdentityHashMapE() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		HashMap h = new HashMap();
		h.put(i1, "hello");
		h.put(i2, "Ravi");
		System.out.println("In case of HashMap " + h);
		IdentityHashMap ih = new IdentityHashMap();
		ih.put(i1, "phani");
		ih.put(i2, "hari");
		System.out.println("In case of IdentityHashMap " + ih);
	}

	private static void methodsInMap() {
		HashMap h = new HashMap();
		h.put(11, "nasndas");
		h.put(51, "hari");
		h.put(61, "naresh");
		h.put(21, "phani");
		h.put(12, "asd");
		System.out.println("H data : " + h);

		HashMap m = new HashMap();
		m.put(1, "sadn");
		m.put(2, "jjj");
		m.putAll(h);

		// m.forEach((k,v) -> System.out.println("Keys : "+k +"values : "+v));

		System.out.println("M data :" + m);
		System.out.println("value of 1 is :" + m.get(1));
		System.out.println(m.remove(1));
		System.out.println("Data of M after remove " + m);
		System.out.println("Contains key : " + m.containsKey(51));
		System.out.println("Contains values : " + m.containsValue("hari"));
		System.out.println("Is Emplty :" + m.isEmpty());
		System.out.println("Size of Map : " + m.size());
	}
}