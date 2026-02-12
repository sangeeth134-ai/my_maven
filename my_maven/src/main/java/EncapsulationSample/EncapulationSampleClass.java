package EncapsulationSample;

public class EncapulationSampleClass {
	
	private int sal;
	private String name;
	private int incentive = 1000;
	
	public void setter(String name,int sal)
	{
		this.name  = name;
		this.sal = sal;
		
	}
	
	public void getter()
	{
		System.out.println(name);
		System.out.println(sal + incentive);
	}


}