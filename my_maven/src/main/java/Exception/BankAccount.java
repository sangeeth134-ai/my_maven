package Exception;

public class BankAccount {

	public void payment(int salary) throws SalaryException
	{
		if(salary < 1000)
		{
			throw new SalaryException("Low Salary");
		}
		else
		{
			System.out.println("Maintaining minimum salary");
		}
		
	}
	
	public static void main(String[] args) throws SalaryException {
	
		BankAccount ba = new BankAccount();
		ba.payment(250);


	}

}
