package step9_00.myarraylist;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		MyArrayList<String> t1 = new MyArrayList<>();
		
		t1.add("hello");
		t1.add("jack");
		t1.add("paul");
		t1.add("john");
		
		t1.add(4, "hi");
		t1.set(0, null);
		
		System.out.println(t1.size());
		System.out.println(t1);
		System.out.println(t1.get(3));
		
		ArrayList<String> c1 = new ArrayList<>();
		
		c1.add("hello");
		c1.add("jack");
		c1.add("paul");
		c1.add("john");
		
		c1.add(2, "park");
		c1.add(5, "park");
		c1.set(4, null);
		
		System.out.println(c1.get(1));
		System.out.println(c1.indexOf("nam"));
		System.out.println(c1.size());
		System.out.println(c1);
	}
}