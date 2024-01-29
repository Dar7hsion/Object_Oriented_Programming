
public class Employee extends Person
{
	protected String Office;
	protected double Salary;
	protected String dateHired;
	
	public Employee(String Na, String Ad, int Nu, String Em, String O, double S, String D)
	{
		super(Na, Ad, Nu, Em);
		Office = O;
		Salary = S;
		dateHired = D;	
	}
	
	public String getOffice()
	{
		return Office;
	}
	public void setOffice(String O)
	{
		Office = O;
	}
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double S)
	{
		Salary = S;
	}
	public String getDatehired()
	{
		return dateHired;
	}
	public void setDatehired(String D)
	{
		dateHired = D;
	}
	
	//getters and setters for office, salary and datehired
	
	public String toString()
	{
		String str = "";
		str += super.toString();
		str += "\nOffice: " + Office;
		str += "\nSalary: " + Salary;
		str += "\ndateHired: " + dateHired;
		return str;
	}
}
