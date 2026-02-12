package Polymorphism;

public class ChildOverride extends ParentOverride{

	@Override					//annotation
	public void display()
	{
		//super.display();
		System.out.println("Child override class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildOverride ob = new ChildOverride();
		ob.display();

	}

}
