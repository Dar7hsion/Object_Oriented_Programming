import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Feb21 {

	public static void main(String[] args) 
	{
		//create a function that takes in a Arraylist
		//and shuffles the values
		//it will return the new Arraylist
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		  list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(8);
	      list.add(3);
	      list.add(9);
		
	      System.out.println("Original list : " + list);
	      Collections.shuffle(list); // shuffling the list
	      System.out.println("Shuffled list : " + list);
	      shuffle(list);
	      System.out.println("After shuffling Arraylist:" + list);
	}
	
	public static void shuffle(ArrayList<Integer> list)
	{
		Random r1 = new Random();
		for(int i = list.size() - 1; i >= 1; i--)
		{
			Collections.swap(list, i, r1.nextInt(i + 1));
		}
		
	}
	public ArrayList<Integer> Shuffle2(ArrayList<Integer> a)
	{	
		Random rand = new Random();
		for(int i =0; i<500; i++)
		{
			int r = rand.nextInt(a.size()-1);
			a.add(a.remove(r));	//removes and addeds to the end of the stack
		}
		return a;
	}
	
}
