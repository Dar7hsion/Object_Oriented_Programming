import java.util.ArrayList;

public class MainFruit {

	public static void main(String[] args) 
	{
		//Create a parent class "Fruit"
		//and 3 child classes "Apple", "Banana", and "Kiwi
		//Make thier toStrings print which fruit they are
		//make a list titled "FruitSalad" that puts and of each into a list
		
		Apple HoneyCrisp = new Apple();
		Banana Banana = new Banana();
		Kiwi Kiwi = new Kiwi();
		//Fruit f = new Fruit();
		
		ArrayList<Fruit> FruitSalad = new ArrayList<Fruit>();
		
		FruitSalad.add(HoneyCrisp);
		FruitSalad.add(Kiwi);
		FruitSalad.add(Banana);
		
		System.out.print(FruitSalad);

	}

}
