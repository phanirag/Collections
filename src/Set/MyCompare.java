package Set;

import java.util.Comparator;

public class MyCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1 < i2)
			return +10;
		else if ( i1 > i2)
			return -10;
		else
		return 0;
	}

}
