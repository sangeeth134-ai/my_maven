package Exception;

public class NullPointerExceptionClass {

	String s = null;
	
	public void print()
	{
		System.out.println(s.length());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullPointerExceptionClass np = new NullPointerExceptionClass();
		np.print();
		
		

	}

}
