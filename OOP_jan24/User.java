
public class User 
{
	//The user is a person who uses an ATM
	
	int accountNumber;
	double balance;
	int PIN;
	String Frist;
	String Last; 
	
	public User(String f, String l, int pin,double a)
	{
		accountNumber = 001;
		PIN = pin;
		Frist = f;
		Last = l;
		balance = a;
	}
	
	public void Withdraw(double w)
	{
		balance = balance - w;
	}
	
	public void Deposit(double d)
	{
		balance = balance + d;
	}
	
	public double checkBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		String str = "";
		str += "Name:" + Frist + " " + Last;
		str += "\nAccount Number:" + accountNumber;
		str += "\nBalance:" + balance;
				
		return str;
	}
	
	

}
