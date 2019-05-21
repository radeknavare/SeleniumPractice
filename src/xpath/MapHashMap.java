package xpath;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Mercedes");
		hm.put(2, "Rolls Royce");
		hm.put(3, "Audi");
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> me = (Entry<Integer, String>) itr.next();
			System.out.println("Key is "+me.getKey()+ " Value is "+me.getValue());
		}
		
		for(Map.Entry me1 : hm.entrySet())
		{
			System.out.println("Key is "+me1.getKey()+ " Value is "+me1.getValue());
		}
		
	}

}
