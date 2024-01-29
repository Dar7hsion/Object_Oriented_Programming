
public class LoanMain {

	public static void main(String[] args) 
	{
		Loan loan = new Loan(0.05, 100000.00, 12, "2/2/2034");
		
		System.out.println(loan + "\n");
		
		System.out.println(loan.getDate() + "\n");
		System.out.println(loan.getRate() + "\n");
		System.out.println(loan.getAmount() + "\n");
		System.out.println(loan.getPayment() + "\n");
		
		loan.setRate(10.00);
		System.out.println(loan.getRate() + "\n");
		
		loan.setAmount(8000);
		System.out.println(loan.getAmount() + "\n");
		
		loan.Payment(8000.00);
		System.out.println(loan.getAmount());

	}

}
