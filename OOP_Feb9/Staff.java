
public class Staff extends Employee
{
	private String Title;

	public Staff(String Na, String Ad, int Nu, String Em, String O, double S, String D, String T) 
	{
		super(Na, Ad, Nu, Em, O, S, D);
		Title = T;
	}
	
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String T)
	{
		Title = T;
	}
	
	public String toString()
	{
		String str = "";
		str += super.toString();
		str += "\nTitle: " + Title;
		return str;
	}
	
}
