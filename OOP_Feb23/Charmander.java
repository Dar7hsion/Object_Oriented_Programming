
public class Charmander extends pokemon
{
	 String type1;
	 String type2;
	 String evo1;
	 String evo2;
	
	 public Charmander(int a)
		{
		 	super(a);
			type1 = "fire";
			type2 = "null";
			evo1 = "Charmeleon";
			evo2= "Charizard";
			name = "Charmander";
		}
		
		public void levelUp()// this is the over load
		{
			super.levelUp();
			
			if(super.getlevel()>=16 && name.equals("Charmander"))
			{
				evolve();
			}
			else if(super.getlevel()>=32 && name.equals("Charmeleon"))
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
			if(name.equals("Charizard"))
			{
				type2= "flying";
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
