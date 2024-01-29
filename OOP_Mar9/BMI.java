
public class BMI 
{
	//double BMI
	
	//Constructor(height, weight)
	//BMI = kg/m^2
	
	//toString
	
	
	private double BMI;
	private double height;
	private double weight;
	//-------------//
	public BMI(double height, double weight)
	{
		calBMI(height,weight);
	}
	//-------------//
	public void calBMI(double weight, double height)
	{
		BMI = weight/(height*height);
	}
	//-------------//
	public String toString()
	{
		String str = "";
		return str + BMI;
	}
}
