package inheritance;

public class SuperCar extends SuperVehicle {

	public void display()
	{
		System.out.println(super.speed);
		super.print();
	}
	
	public SuperCar()
	{
		super();
		//System.out.println("SuperCarConstructor (Child)");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperCar ob  = new SuperCar();
		ob.display();

	}

}
