package Exception;

public class ThrowClass {
	
	public static void display(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
			
		}
		
	}

	public static void main(String[] args) {
		//try
		//{
		ThrowClass.display(16);
		//}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		//}
		
	}

}
