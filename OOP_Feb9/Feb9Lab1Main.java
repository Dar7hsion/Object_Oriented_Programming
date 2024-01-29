import java.util.ArrayList;

public class Feb9Lab1Main {

	public static void main(String[] args) 
	{
		Person JaneSmith = new Person("Jane Smith","501 dround" ,910, "places@things.com");
		
		System.out.println(JaneSmith + "\n");
		
		JaneSmith.setAddress("Street");
		System.out.println(JaneSmith.getAddress() + "\n");
		
		JaneSmith.setName("Name");
		System.out.println(JaneSmith.getName() + "\n");
		
		JaneSmith.setNumber(0);
		System.out.println(JaneSmith.getNumber() + "\n");
		
		JaneSmith.setEmail("@");
		System.out.println(JaneSmith.getEmail() + "\n");
	
		System.out.println(JaneSmith.toString() + "\n\n");
	
	
		Student JaneDoe = new Student("Jane Doe","502 dround" ,920, "places&cats@things.com", "Active");
	
		System.out.println(JaneDoe + "\n");
		
		JaneDoe.setName("Name");
		System.out.println(JaneDoe.getName() + "\n");
		
		JaneDoe.setAddress("Street");
		System.out.println(JaneDoe.getAddress() + "\n");
		
		JaneDoe.setName("Name");
		System.out.println(JaneDoe.getName() + "\n");
		
		JaneDoe.setNumber(0);
		System.out.println(JaneDoe.getNumber() + "\n");
		
		JaneDoe.setEmail("@");
		System.out.println(JaneDoe.getEmail() + "\n");
		
		JaneDoe.setClassstaties("Inactive");
		System.out.println(JaneDoe.getClassstaties() + "\n");
		
		System.out.println(JaneDoe.toString() + "\n\n");
		
		Employee JoneDoe = new Employee("Jone Doe","503 dround" ,930, "places&cats&Birds@things.com", "503 oxeman building", 500000, "1/1/2002");
		
		System.out.println(JoneDoe + "\n");
		
		JoneDoe.setName("Name");
		System.out.println(JoneDoe.getName() + "\n");
		
		JoneDoe.setAddress("Street");
		System.out.println(JoneDoe.getAddress() + "\n");
		
		JoneDoe.setName("Name");
		System.out.println(JoneDoe.getName() + "\n");
		
		JoneDoe.setNumber(0);
		System.out.println(JoneDoe.getNumber() + "\n");
		
		JoneDoe.setEmail("@");
		System.out.println(JoneDoe.getEmail() + "\n");
		
		JoneDoe.setOffice("none");
		System.out.println(JoneDoe.getOffice() + "\n");
		
		JoneDoe.setSalary(0);
		System.out.println(JoneDoe.getSalary() + "\n");
		
		JoneDoe.setDatehired("none");
		System.out.println(JoneDoe.getDatehired() + "\n");
		
		System.out.println(JoneDoe.toString() + "\n\n");
		
		
		
		Staff BobDoe = new Staff("Bob Doe","503 dround" ,950, "places&cats&Birds&corn@things.com", "508 oxeman building", 1000, "1/1/2020", "King");
		
		System.out.println(BobDoe + "\n");
		
		BobDoe.setName("Name");
		System.out.println(BobDoe.getName() + "\n");
		
		BobDoe.setAddress("Street");
		System.out.println(BobDoe.getAddress() + "\n");
		
		BobDoe.setName("Name");
		System.out.println(BobDoe.getName() + "\n");
		
		BobDoe.setNumber(0);
		System.out.println(BobDoe.getNumber() + "\n");
		
		BobDoe.setEmail("@");
		System.out.println(BobDoe.getEmail() + "\n");
		
		BobDoe.setOffice("none");
		System.out.println(BobDoe.getOffice() + "\n");
		
		BobDoe.setSalary(0);
		System.out.println(BobDoe.getSalary() + "\n");
		
		BobDoe.setDatehired("none");
		System.out.println(BobDoe.getDatehired() + "\n");
		
		BobDoe.setTitle("Queen");
		System.out.println(BobDoe.getTitle() + "\n");
		
		System.out.println(BobDoe.toString() + "\n\n");
		
		
		
		Faculty NeedDoe = new Faculty("Need Doe","507 dround" ,960, "places&cats&Birds&corn&@things.com", "503 oxeman building", 500000, "1/1/2002", "9:00", "10");
		
		System.out.println(NeedDoe + "\n");
		
		NeedDoe.setAddress("Street");
		System.out.println(NeedDoe.getAddress() + "\n");
		
		NeedDoe.setName("Name");
		System.out.println(NeedDoe.getName() + "\n");
		
		NeedDoe.setNumber(0);
		System.out.println(NeedDoe.getNumber() + "\n");
		
		NeedDoe.setEmail("@");
		System.out.println(NeedDoe.getEmail() + "\n");
		
		NeedDoe.setOffice("none");
		System.out.println(NeedDoe.getOffice() + "\n");
		
		NeedDoe.setSalary(0);
		System.out.println(NeedDoe.getSalary() + "\n");
		
		NeedDoe.setDatehired("none");
		System.out.println(NeedDoe.getDatehired() + "\n");
		
		NeedDoe.setOfficehours("12:00pm");
		System.out.println(NeedDoe.getOfficehours() + "\n");
		
		NeedDoe.setRank("Toast");
		System.out.println(NeedDoe.getRank() + "\n");
		
		System.out.println(NeedDoe.toString() + "\n\n");
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		Student Jessica = new Student("Jessica", "12 Streat", 5551234, "jes@things.com","Senior");
		Student James = new Student("James", "11 Streat", 5551666, "James@things.com","Junioe");
		
		student.add(Jessica);
		student.add(James);
		
		System.out.println(student);
		
		ArrayList<Person> classList = new ArrayList<Person>();
		
		classList.add(JaneDoe);
		classList.add(James);
		classList.add(JaneSmith);
		classList.add(BobDoe);
		classList.add(JoneDoe);
		
		System.out.println(classList);
		
	}
}
