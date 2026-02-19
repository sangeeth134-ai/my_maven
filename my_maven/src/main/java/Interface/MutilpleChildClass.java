package Interface;

public class MutilpleChildClass implements interParent1, InterParent2 {
	
    public void show()
    {
    	System.out.println("Method of Child Class");
    }
    
    public void display()
    {
    	System.out.println(a+b);
    }
    
    public void print()
    {
    	System.out.println("Method of parent2");
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutilpleChildClass  mcc = new MutilpleChildClass();
		mcc.show();
		mcc.display();
		mcc.print();
		

	}

}
