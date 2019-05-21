package xpath;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(5);
		hs.add(20);
		hs.add(0);
		hs.add(1);
		System.out.println(hs);

		
		Iterator<Integer> itr =hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Set<Integer> ts = new TreeSet<Integer>(hs);
		System.out.println(ts);

	}

}
