package EncapsulationSample;

public class EncapsulationAssignmentClass {
	
	private int mark;
	private int bonus = 100;
	private String name;
	private int rollnum;
	private int TotalMark;
	
	public void setter(int mark, int rollnum, String name)
	{
		this.mark = mark;
		this.name= name;
		this.rollnum = rollnum;
		
	}
	
	public void getter()
	{
		System.out.println("Name of the Student: " + name);
		System.out.println("Roll Number: "+ rollnum);
		TotalMark = mark + bonus;
		System.out.println("Total Mark : " + TotalMark);
	}
	
	

}
