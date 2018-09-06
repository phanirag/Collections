package com.collection.classes;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private static ArrayList<String> o;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.out.println("adding method:");
		adding();
		System.out.println("Adding Collections to List:");
		addCollectionstoList();
		System.out.println("Clear List:");
		clearMethod();
		System.out.println("LastIndexOf:");
		lastIndexOf();
		System.out.println("toArray:");
		toArray();
		System.out.println("Clone:");
		clonemethod();
		System.out.println("trimToSize");
		trimToSize();
		
	}

	private static void trimToSize() {
		o=new ArrayList<String>(9);	//Size of List is 9
		o.add("sda");
		o.add("sdda");
		System.out.println(o);
		o.trimToSize();// now the size of the List becomes 2
	}

	private static void clonemethod() {
		List<String> copy=(ArrayList<String>)(o).clone();
		System.out.println(copy);
	}

	private static void toArray() {
		List<Integer> al = new ArrayList<Integer>();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);
	 
	        Integer[] arr = new Integer[al.size()];
	        arr = al.toArray(arr);
	 
	        for (Integer x : arr)
	            System.out.print(x + " ");
	        System.out.println();
	}

	private static void lastIndexOf() {
		int i=o.lastIndexOf("1");// returns -1 when no value is present
		System.out.println(i);
		adding();
		int j=o.lastIndexOf("1");// returns 1 if present
		System.out.println(j);
	}

	private static void clearMethod() {
		o.clear();
		System.out.println(o);
	}

	private static void addCollectionstoList() {
		List l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		o.addAll(l);
		System.out.println(o);
	}

	private static void adding() {
		o = new ArrayList<String>(8);
		o.add("2");
		o.add("1");
		o.add("5");
		System.out.println(o);
	}
	
	
	
	
}
