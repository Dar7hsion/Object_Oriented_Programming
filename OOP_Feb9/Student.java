
public class Student extends Person
{
	private String classStatis;
	
	public Student(String Na, String Ad, int Nu, String Em, String c)
	{
		super(Na, Ad, Nu, Em);
		classStatis = c;
	}
	
	public String getClassstaties()
	{
		return classStatis;
	}
	public void setClassstaties(String c)
	{
		classStatis = c;
	}
	//getter and setter for class statues
	
	public String toString()
	{
		String str = "";
		str += super.toString();
		str += "\nClass Statis: " + classStatis;
		return str;
	}
	
	
	
}
