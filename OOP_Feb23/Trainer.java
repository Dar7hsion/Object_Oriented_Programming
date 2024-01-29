import java.util.ArrayList;
import java.util.Arrays;

public class Trainer 
{
	//Attributes
	//a pokemon party of up to six //array
	//a pc box, to hold the extra pokemon//arraylist
	
	pokemon [] Party = new pokemon[6];
	ArrayList<pokemon> PC = new ArrayList<pokemon>();
	
	//a constructor
	public Trainer()
	{
		
	}
	
	public void addPoke(pokemon p)
	{
		for(int i =0; i < 6; i++)
		{
			if(Party[i]==null)
			{
				Party[i]=p;
				i = Party.length + 1;//or break or return;
			}
		}
		PC.add(p);
		
		
	}
	public String toString()
	{
		String str = "";
		str += "Party: " + Arrays.toString(Party);
		str += "\nPC: " + PC;
		return str;
	}
	
	//behaviors
	//addPokemon (Pokemon p), that checks if their is room in the party, and if not adds to the PC box
	
	//toString()
}
