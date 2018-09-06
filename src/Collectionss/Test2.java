package Collectionss;

import java.util.Collections;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
	String s="234746";
	int t=Integer.parseInt(s);
	LinkedList<Integer> a=new LinkedList<Integer>();
	System.out.println(t);
		while(t>0) {
	 	a.add(t%10);
		t=t/10;
		Collections.reverse(a);
		}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		int max=a.size();
		System.out.println("Min value is "+a.get(0)+"max value is "+a.get(max-1));
	}
}
