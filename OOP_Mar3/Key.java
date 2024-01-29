import java.util.ArrayList;

public class Key 
{
	//String [] places;
	ArrayList<String> places;
	
	public Key(ArrayList<String> p)
	{
		places = p;
	}
	
	public boolean use(String p)
	{
		if(places.contains(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return places.toString();
	}
}
