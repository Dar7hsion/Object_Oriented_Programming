
public class MainRectangularPrism {

	public static void main(String[] args) 
	{
		RectangularPrism p1 = new RectangularPrism(2, 2, 2);
		
		System.out.println(p1);
		
		p1.setHeight(10);
		
		System.out.println(p1.getHeight());
		
		System.out.println(p1.getArea());


	}

}
