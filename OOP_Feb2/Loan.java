
public class Loan 
{
	private double rate;
	private double amount;
	private int years;
	private String date;
	private double payment;
	
	public Loan(double r, double a, int y, String m)
	{
		rate = r;
		amount = a;
		years = y;
		date = m;
		calcPayment();
	}
	
	public double getRate()
	{
		return rate;
	}
	public void setRate(double r)
	{
		rate = r;
		calcPayment();
	}
	
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double a)
	{
		amount = a;
		calcPayment();
	}
	
	public int getYears()
	{
		return years;
	}
	public void setYears(int y)
	{
		years = y;
		calcPayment();
	}
	
	public String getDate()
	{
		return date;
	}
	public void setDate(String m)
	{
		date = m;
	}
	
	public void calcPayment()
	{
		payment = amount/years*Math.pow(1+rate/100, years);
	}
	public void Payment(double p)
	{
		payment = p;
		amount -=payment;
		calcPayment();
	}
	public double getPayment()
	{
		return payment;
	}
	
	public String toString()
	{
		String str = "";
		str += "rate: " + rate;
		str += "\namount due: " + amount;
		str += "\nyears till total is due: " + years;
		str += "\nmonthly minimum payment: " + payment;
		str += "\nDate loan is due: " + date;
		return str;
	}
}
