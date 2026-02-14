package Exception;

public class ExceptionHandleSample {

	public void display()
	{
		
		int a = 10;
		try 
		{
		int b = a/0;
		System.out.println(b);
		}
		/*catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}*/
		
		finally
		{
			System.out.println("Finally");  //if we handled exception or not this code with execute
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandleSample ex = new ExceptionHandleSample();
		//System.out.println("End of statement");
		ex.display();
		System.out.println("End of statement");

		
	}

}
