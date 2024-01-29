
public class Squirtle extends pokemon
{
	 String type1;
	 String type2;
	 String evo1;
	 String evo2;

	 public Squirtle(int a)
		{
		 	super(a);
			type1 = "water";
			type2 = null;
			evo1 = "Wartortle";
			evo2= "Blastoise";
			name = "Squirtle";
		}
		
		public void levelUp()// this is the over load
		{
			super.levelUp();
			
			if(super.getlevel()>=16 && name.equals("Squirtle"))
			{
				evolve();
			}
			else if(super.getlevel()>=32 && name.equals("Wartortle"))
			{
				evolve();
			}	
		}
		
		public void evolve()
		{
			if(!evo1.equals(null))
			{
				name = evo1;
				evo1 = evo2;
				evo2=null;
			}
		}
		
		public String toString()
		{
			String str = super.toString();
			str += "Type-1: " + type1;
			str += "\nType-2: " + type2;
			//str += "\nEvol-1: " + evo1;
			//str += "\nEvol-2: " + evo2;
			str += "\nName: " + name + "\n";
			return str;
		}
}
