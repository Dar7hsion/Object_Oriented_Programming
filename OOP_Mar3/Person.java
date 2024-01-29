
public class Person 
{
	private String name;
	private int HP;
	private Key key;
	
	public Person(String n, int h)
	{
		name = n;
		HP = h;
	}
	
	public void pickUp(Key k)
	{
		if(key == null)
		{
			key = k;
		}
		else
		{
			System.out.println("you can only have one key at a time");
		}
	}
	
	public void drop()
	{
		key = null;
	}
	
	public String toString()
	{
		String str = "";
		str += "\nName: " + name;
		str += "\nKey: " + key;
		str += "\nHP: " + HP;
		return str;
	}

}
