package Exception;

public class NullPointerExceptionClass {

	String s = null;
	
	public void print()
	{
		try {
		System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullPointerExceptionClass np = new NullPointerExceptionClass();
		np.print();
		
		

	}

}
