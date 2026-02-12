package Interface;

public class SampleClass implements InterfaceSample {

	public  void print()
	{
		System.out.println("Method of class");
	}
	
	public void add()
	{	
		System.out.println(a+b);		
	}
	
	public void display()
	{
		System.out.println("Method in Interface");
	}
	
	public static void main(String[] args) {
		
		SampleClass  ob  = new SampleClass();
		ob.print();
		ob.add();
		ob.display();
		System.out.println(a);
		
		System.out.println("----------");
		
		InterfaceSample  ob1 = new SampleClass();  //using constructor of class since interface has no constructor 
		ob1.add();
		//ob1.print();
		ob1.display();
		System.out.println(ob1.a);
		
		
		
		
		
	}

}
