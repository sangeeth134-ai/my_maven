package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSampleClass {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//add, addAll, remove, removeAll, get, size , contains
		
		ArrayList al = new ArrayList();
		al.add("Hi");
		al.add(12);
		al.add('d');
		al.add(34.5f);
		
		System.out.println(al);
		
		ArrayList  <String>  al1 = new ArrayList();
		al1.add("Hello");
		al1.add("Hi");
		al1.add("Java");
		
		System.out.println(al1);
		
		ArrayList  <String>  al2 = new ArrayList();
		al2.add("Car");
		al2.add("Bus");
		al2.add("Jeep");
		System.out.println(al2);
		
		
		al2.remove(1);
		System.out.println(al2);
		
		al2.addAll(al1);
		System.out.println(al2);
		
		al.removeAll(al);
		System.out.println(al);
		
	
		System.out.println(al2.get(3));  // to print a value particular index
		
		System.out.println(al2.size());
		
		//System.out.println(al2.contains("Java"));
		
		boolean r = al2.contains("Java");
		System.out.println(r);
		
		boolean r1 = al2.contains("abcd");
		System.out.println(r1);
		
		
		System.out.println("**Iterator**");
		
		Iterator it = al2.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
				
		}
		
		it.remove();
		System.out.println(al2);
		
		
		System.out.println("********For each *****");
		for(String ss:al2)
		{
			System.out.println(ss);
		}
		

	}
		
}
