
public class Person 
{
	protected String Name;
	protected String Address;
	protected int Number;
	protected String Email;
	
	public Person(String Na, String Ad, int Nu, String Em)
	{
		Name = Na;
		Address = Ad;
		Number = Nu;
		Email = Em;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Na)
	{
		Name = Na;
	}
	
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String Ad)
	{
		Address = Ad;
	}
	
	public int getNumber()
	{
		return Number;
	}
	public void setNumber(int Nu)
	{
		Number = Nu;
	}
	
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String Em)
	{
		Email = Em;
	}
	public String toString()
	{
		String str = "";
		str += "Name: " + Name;
		str += "\nAddress: " + Address;
		str += "\nNumber: " + Number;
		str += "\nEmail: " + Email;
		return str;
	}
}
