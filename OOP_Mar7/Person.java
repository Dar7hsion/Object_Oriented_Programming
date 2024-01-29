
public class Person 
{
	private int HP;
	private Key k;
	
	public Person(int h)
	{
		HP = h;
	}
	
	public int getHP()
	{
		return HP;
	}
	public void setHP(int h)
	{
		HP = h;
	}
	
	public void dropKey()
	{
		k = null;
	}
	public void pickUpkey(Key key)
	{
		
		if(k == null)
		{
			 k = key;
		}
		else
		{
			System.out.println("you can only have one key at a time");
		}
		
	}
	
	public String toString()
	{
		String str = "";
		str += "\nKey: " + k;
		str += "\nHP: " + HP;
		return str;
		
	}
	
}
