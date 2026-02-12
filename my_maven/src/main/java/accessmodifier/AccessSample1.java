package accessmodifier;

public class AccessSample1 {
	
	public int a = 10;
	private String b ="hi";
	protected  char v = 'c';
	float c = 6.7f;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(v);
		System.out.println(c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessSample1 ob = new AccessSample1();
		ob.display();

	}

}
