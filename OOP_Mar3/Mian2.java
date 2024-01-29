import java.util.ArrayList;

public class Mian2 {

	public static void main(String[] args) 
	{
		
		Person p1 = new Person("Human", 25);
		
		ArrayList<String> key1 = new ArrayList<String>();
		
		key1.add("BossDoor");
		
		ArrayList<String> Key2 = new ArrayList<String>();
		
		Key2.add("door1");
		
		Key2.add("door2");
		
		Key k1 = new Key(key1);
		Key k2 = new Key(Key2);
		
		p1.pickUp(k1);
		p1.pickUp(k2);
		
		p1.drop();
		p1.pickUp(k2);
		
		System.out.println(p1);
		System.out.println(k2.use("door1"));

	}

}
