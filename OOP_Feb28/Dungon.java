
public class Dungon 
{
	Room [][] dungeon = new Room[2][2]; //create a two by two grid of rooms
	
	public Dungon()
	{
		Room r1 = new Room(false, false, true, true, false);//rooms only exist inside the dungeon
		Room r2 = new Room(false, false, false, true, true);//the is what makes this comosition
		Room r3 = new Room(false, true, true, false, false);
		Room r4 = new Room(true, true, false, false, true);
		dungeon [0][0] = r1;
		dungeon [0][1] = r2;
		dungeon [1][0] = r3;
		dungeon [1][1] = r4;
		
	}
	
	public String toString()
	{
	 return dungeon [0][0] + ", " + dungeon [0][1] + ", " + dungeon [1][0] + ", " + dungeon [1][1] + ", ";
	}
}
