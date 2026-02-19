package Exception;

public class SampleUserClass {
	
	public void test(int age) throws LicenceException
	{
		if (age<18)
		{
			throw new LicenceException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
		
	}
	
	public static void main(String[] args) throws LicenceException
	{
		SampleUserClass   ob = new SampleUserClass();
		ob.test(13);
	}

}
