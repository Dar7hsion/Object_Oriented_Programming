import java.util.Scanner;

public class Key 
{
	private String[] keylist;
	
	public Key(String[] a)
	{
		keylist =a;
	}
	
	public String[] getList()
	{
		return keylist;
	}
	public void setlist(String[] a)
	{
		
		keylist = a;
	}
	
	public void useKey(String a)
	{	
		for(int i =0; i<keylist.length; i++)
		{
			if(keylist[i].equals(a))
			{
				System.out.println("Door unlocks");
				return;
			}
			
		}
		System.out.println("Door remains locked");
	}
	
	public String toString()
	{
		String str = "";
		
		return str + keylist;
	}
	
	
}
