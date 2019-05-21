package xpath;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		System.out.println(al);
		al.remove(0);
		al.add(1,"third");
		System.out.println(al);
		
		}

}
