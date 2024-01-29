import java.util.Arrays;

public class Keymain {

	public static void main(String[] args) 
	{
		
		String [] key=new String [] {"door", "chest", "exit"};//this make the string 
		
		Key k1 = new Key(key);//this passes the string in to the key building the key object
		
		Person Alex = new Person(15);// this builds the person
		
		Alex.pickUpkey(k1);
		
		System.out.println(Arrays.deepToString(key));
		
		k1.useKey("box");
		
		k1.useKey("chest");
		
		
		
	}
}
