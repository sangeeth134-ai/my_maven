package Abstraction;

public class SampleChildClass extends AbstractClass{

	public void print()
	{
		System.out.println("Definition of abstract class");
		
	}
	public static void main(String[] args) {

		SampleChildClass  ob1 = new SampleChildClass();
		ob1.print();
		ob1.display();
	}

}
