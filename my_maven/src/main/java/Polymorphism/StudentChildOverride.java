package Polymorphism;

public class StudentChildOverride extends StudentParentOverride{

	
	@Override
	public void studenDetails(String name)
	{
	
		System.out.println("ChildClass Student name :" + name);
	}
	
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentChildOverride ob = new StudentChildOverride();
		ob.studenDetails("StudentName1");
		
	}

}
