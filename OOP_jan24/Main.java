
public class Main {

	public static void main(String[] args) 
	{
		User Alex = new User("Alex", "Purser", 1234, 500.0);
		Alex.Withdraw(25);
		Alex.Withdraw(200.50);
		
		System.out.println(Alex.balance);//prints that balance for user Alex
		
		Alex.Deposit(500.0);
		
		System.out.println(Alex.checkBalance());
		
		System.out.println(Alex);
		
		String str = "hello";
		
		System.out.println(str);
		
		
		
		String str2 = str;
		
		System.out.println(str2);

	}

}
