
public class Faculty extends Employee
{
	
	private String officeHours;
	private String Rank;

	public Faculty(String Na, String Ad, int Nu, String Em, String O, double S, String D, String H, String R) 
	{
		super(Na, Ad, Nu, Em, O, S, D);
		officeHours = H;
		Rank = R;
	}
	
	public String getOfficehours()
	{
		return officeHours;
	}
	public void setOfficehours(String H)
	{
		officeHours = H;
	}
	
	public String getRank()
	{
		return Rank;
	}
	public void setRank(String R)
	{
		Rank = R;
	}
	
	public String toString()
	{
		String str = "";
		str += super.toString();
		str += "\nOffice Hours: " + officeHours;
		str += "\nRank : " + Rank;
		return str;
	}

}
