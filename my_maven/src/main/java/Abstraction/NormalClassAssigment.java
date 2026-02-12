package Abstraction;

public class NormalClassAssigment extends Shape{
	
	public void draw()
	{
		System.out.println("draw triangle");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NormalClassAssigment ob = new NormalClassAssigment();
		ob.draw();
		ob.display();
	}

}
