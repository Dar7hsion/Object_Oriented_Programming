
public class PrintCricle {

	public static void main(String[] args) 
	{
		
		//now that we have a constructor, we can start defining circles
		
//		Circle c1 = new Circle(5); //creates a new circle variable with a radius of 5
		
		//this should look familiar, its a lot like our arrys from before
		//int  [] arr new int [10];
		
//		Circle c2 = new Circle(10);
//		
//		Circle c3 = new Circle(8);
//		
//		System.out.println(c1+ "\n");
//		
		//System.out.println(c1.area); //now that its private we cannot access this variable 
		
		//c1.area = 12;// Because the variable is public the user can change it
		
		//System.out.println(c1);//and now our area is incorrect
		//jan26
//		System.out.println(c1.getArea()+ "\n");
//		System.out.println(c1.getArea()*12 + "\n");
		
		//c1.setRadius(12);
		
		//System.out.println(c1+ "\n");
		
//		Square s1 = new Square(2);
//		Square s2 = new Square(10);
//		Square s3 = new Square(15);
//		
//		System.out.println("\n" + s1);
		
//		s1.setWidth(20);
//		
//		System.out.println("\n" + s1 + "\n");
//		
//		System.out.println(s1.getArea()+ "\n");
//		
//		System.out.println("\n" + s2 + "\n");
//		System.out.println("\n" + s3 + "\n");
//		
//		s2.setWidth(8);
//		
//		System.out.println(s2.getArea()+ "\n");
		
		//PracticeNotesSphere
		
//		PracticeNotesSphere sp1 = new PracticeNotesSphere(10);
//		
//		System.out.print(sp1.getRadius()+ "\n");
//		System.out.print(sp1.getVolume()+ "\n");
//		System.out.print(sp1.getSufacearea()+ "\n");
//		System.out.print(sp1.getCircumference()+ "\n"+ "\n");
//		
//		sp1.setRadius(4);
//		
//		System.out.print(sp1);
		
//		c1.setColor("Green");
//		c1.setFilled(true);
//		System.out.println(c1);
//		
//		Shape sh1 = new Shape("Purple", false);
//		System.out.println(sh1);
//		
//		System.out.println(c1.toString());
//		
//		Square s3 = new Square(5, "pink", true);
//		
//		System.out.println(s3);
//				
		Point p = new Point(5,10);
		Point p2 = new Point(25, 30);
		
		Shape s1 = new Shape("blue",true, p);
		
		System.out.println(s1.location.distance(p2));
		
		System.out.println(p2);
		
		
	}

}
