package Collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class Test1{

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(50);
		a.add(230);
		a.add(40);
		a.add(400);
		a.add(15);
		System.out.println(a);
	   Collections.sort(a);
	   System.out.println("sorted list is "+a);
		int max=a.size();
		System.out.println(max);
		System.out.println("min value is"+a.get(0)+"max value is "+a.get(max-1));
		Collections.reverse(a);
		System.out.println("revers order of list is "+a);
	}

}
