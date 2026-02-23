package inheritance;

public class hierarchicalChild1 extends hierarchicalParent{

	public void add()
	{
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hierarchicalChild1  obj = new hierarchicalChild1();
		obj.display();
		obj.add();
		
	}

}
