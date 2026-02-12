package Interface;

public class AreaClass implements InterfaceArea{

	public void draw()
	{
		System.out.println("Draw a Shape");
	}
	
	
	public void shape()
	{
		System.out.println("Rectangle");
	}
	

	public void area ()
	{
		System.out.println(length*breadth);	
	}
	
	
	public static void main(String[] args) {

		AreaClass a = new AreaClass();
		a.draw();
		a.shape();
		a.area();
		
		
	}

}
