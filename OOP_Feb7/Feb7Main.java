
public class Feb7Main {

	public static void main(String[] args) 
	{
		Dog Moony = new Dog("Moony", 110, 70);
		
		Cat Yin = new Cat("Yin", 12, 20);
		
		Person Jessica = new Person("Jessica", Yin); //here i passed in an object as an ar
		
		
		System.out.println(Jessica);
		
		
		//Animal Deimos = new Animal("Deimos", 10, 18);
		Animal Deimos = new Cat("Deimos", 10, 18);
		System.out.println("");
		System.out.println("");
		
		Moony.speak();
		Yin.speak();
		Deimos.speak();

	}

}
