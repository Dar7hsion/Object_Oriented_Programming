
public class Car 
{
	public enum Type
	{
		SUV,
		SEDAN,
		Truck,
		COMPACT,
	}
	
	private String color;
	private String make;
	private String model;
	private Type type;
	
	public Car(String c, String ma, String mo)
	{
		color = c;
		make = ma;
		model =mo;
	}
	
	public void setType(String s)
	{
		if(s.equals("SUV"))
			type = Type.SUV;
		else if(s.equals("SEDAN"))
			type = Type.SEDAN;
		else if(s.equals("COMPACT"))
			type = Type.COMPACT;
	}
	
	public String toString()
	{
		String str = "";
		str+= "make: " + make;
		str+= "model: " + model;
		str+= "type: " + type;
		return str;
	}
	
	
}
