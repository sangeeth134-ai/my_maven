package Exception;

public class ThrowClassAssignment {
	
	public static void numberCheck()
	{
		int a= -10;
		if (a<0)
		{
			throw new ArithmeticException("Invalid number");
		}
		else
		{
			System.out.println("Valid Number");
		}
		
		
	}

	public static void main(String[] args) {
		
		ThrowClassAssignment.numberCheck();
		

	}

}
