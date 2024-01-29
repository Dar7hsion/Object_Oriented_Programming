
public class RectangularPrism 
{
	private int lenght;
	private int width;
	private int height;
	private int volume;
	private int surfaceArea;
	
	public RectangularPrism(int l, int w, int h)
	{
		lenght = l;
		width = w;
		height = h;
		calcVol();
		calcArea();
	}
	
	public void setLenght(int l)
	{
		lenght = l;
		calcVol();
		calcArea();
	}
	public int getLenght()
	{
		return lenght;
	}
	
	public void setWidth(int w)
	{
		width = w;
		calcVol();
		calcArea();
	}
	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int h)
	{
		height = h;
		calcVol();
		calcArea();
	}
	public int getHeight()
	{
		return height;
	}
	
	public void calcVol()
	{
		//V=L*W*H
		volume = lenght*width*height;
	}
	public int getVol()
	{
		return volume;
	}
	
	public void calcArea()
	{
		//A=2(wl+hl+hw)
		surfaceArea = 2*((width*lenght)+(height*lenght)+(height*width));
	}
	public int getArea()
	{
		return surfaceArea;
	}
	
	public String toString()
	{
		String str = "";
		str += "Height: " + height;
		str += "\nWidth: " + width;
		str += "\nLenght: " + lenght;
		str += "\nSurface Area: " + surfaceArea;
		str += "\nVolume: " + volume;
		return str;
	}
}
