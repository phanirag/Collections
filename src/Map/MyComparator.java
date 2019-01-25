package Map;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object a1, Object a2) {
		String s1 = (String)a1;
		String s2 = (String)a2;
		return s2.compareTo(s1);
	}

}
