package Exception;

public class ExceptionSample {
	
	public void display()
	{
		
		int a = 10;
		int b = a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionSample e = new ExceptionSample();
		System.out.println("End of Statement");
		e.display();
		System.out.println("End of Statement");
		
	}

}
