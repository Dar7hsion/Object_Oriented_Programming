
public class Address 
{
	private int Number;
	private String Street;
	
	public Address(int n, String s)
	{
		Number = n;
		Street = s;
	}
	
	public int getNumber()
	{
		return Number;
	}
	public void setNumber(int n)
	{
		Number = n;
	}
	
	public String getStreet()
	{
		return Street;
	}
	public void setStreet(String s)
	{
		Street = s;
	}
	
	public String toString()
	{
		return Number + " " + Street;
	}
	
	

}
