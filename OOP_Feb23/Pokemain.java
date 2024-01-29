import java.util.ArrayList;

public class Pokemain {

	public static void main(String[] args) 
	{
		Bulbasaur b1 = new Bulbasaur(1);
		Bulbasaur b2 = new Bulbasaur(1);
		Charmander c1 = new Charmander(1);
		Charmander c2 = new Charmander(1);
		Squirtle s1 = new Squirtle(1);
		Charmander c3 = new Charmander(1);
		Charmander c4 = new Charmander(1);
		Squirtle s2 = new Squirtle(1);
		
		for(int i = 0; i<21; i++)
		{
			b2.levelUp();
			c2.levelUp();
		}
		
		s1.addXP(13582);
		Trainer dawn = new Trainer();
		//ArrayList<pokemon> team = new ArrayList<pokemon>();
		
		//team.add(s1);
		//team.add(c2);
		//team.add(c1);
		//team.add(b1);
		//team.add(b2);
		dawn.addPoke(b1);
		dawn.addPoke(b2);
		dawn.addPoke(c1);
		dawn.addPoke(c2);
		dawn.addPoke(s1);
		dawn.addPoke(c3);
		dawn.addPoke(c4);
		dawn.addPoke(s2);
		
		
		System.out.println(dawn);
		//System.out.println(team);
		
		//test will be, method overload, child and parent, Array list

	}

}
