package Collections;

import java.util.ArrayList;
import java.util.List;



public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li  = new ArrayList();
		li.add("abc");
		li.add(3);
		li.add('g');
		
		System.out.println(li);
		
		List <String> l2  = new ArrayList();
		l2.add("Hi");
		l2.add("Hello");
		l2.add("Good Morning");
		
		System.out.println(l2);
		
		List <String> l3  = new ArrayList();
		l3.add("one");
		l3.add("two");
		l3.add("three");
		
		System.out.println(l3);
		
		l3.add("four");
		System.out.println(l3);
		
		l3.remove(3);
		System.out.println(l3);
		
		l3.addAll(l2);
		System.out.println(l3);
		
		li.removeAll(li);
		System.out.println(li);
		
		System.out.println(l3.get(0));
		
		System.out.println(l3.size());
		
		boolean b= l3.contains("ABCS");
		System.out.println(b);
		
		boolean b2= l3.contains("two");
		System.out.println(b2);
		
		
		
		
		
		
		
		
		

	}

}
