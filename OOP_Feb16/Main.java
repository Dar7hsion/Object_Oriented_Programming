import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		//ArrayList can use any reference data type. There is a reference version of int, Integer
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		
		list.add(5, 104);//first argument is where the element is, second argument is the element
		list.set(6, 90);//replaces the element at the given index
		System.out.println(list.get(5));//gets the element at position 5
		
		
		
		System.out.println(list.indexOf(104));//finds the given element of the list, it returns -1 if not found
		
		System.out.println(list);
		
		list.remove(5);
		
		System.out.println(list);
		
		list.remove((Integer)(100));
		
		System.out.println(list);
		
		while(list.contains((Integer)(100)))
				{
					list.remove((Integer)(100));
				}
		System.out.println(list);
		
		list.clear(); // removes all elements from the list 
		
		System.out.print(list.size());
		
		
		
		//ArrayList<Object> list = new ArrayList<Object>();
		//Apple a = new Apple();
		//list.add(Yin);
		//list.add(a);
		//list.add(Moony);
		
		//System.out.println(list);
	}

}
