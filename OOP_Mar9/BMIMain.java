
public class BMIMain {

	public static void main(String[] args) 
	{

		Person Alex = new Person("Alex", 29, 182, 5.9);
		
		System.out.println(Alex);
		
		Alex.setBMI(100, 100);
		System.out.println(Alex.getBMI());
		
		Alex.setName("Bob");
		System.out.println(Alex.getName());
		
		Alex.setAge(10);
		System.out.println(Alex.getAge());
		
		Alex.setHeight(10);
		System.out.println(Alex.getHeight());
		
		Alex.setWeigh(10);
		System.out.println(Alex.getWeight());
	}

}
