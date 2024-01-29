
public class Room 
{
	boolean hasExit;
	boolean nDoor;
	boolean sDoor;
	boolean eDoor;
	boolean wDoor;
	
	public Room(boolean h, boolean n, boolean e, boolean s, boolean w)
	{
		hasExit = h;
		nDoor = n;
		sDoor = s;
		eDoor = e;
		wDoor = w;
		
	}
	
	public String toString()
	{
		String str = "";
		if(nDoor)
		{
			str += "North ";
		}
		if(eDoor)
		{
			str += "East ";
		}
		if(sDoor)
		{
			str += "South ";
		}
		if(wDoor)
		{
			str += "West";
		}
		if(hasExit)
		{
			str += "Exit Door ";
		}
		return str;
	}
}
