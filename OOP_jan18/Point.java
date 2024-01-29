
public class Point 
{
	//represents a point on an x, y coordinate plane
	
	//x
	//y
	protected int x;
	protected int y;
	
	//Constructor(X, Y)
	public Point(int x, int y)
	{
		this.x = x;
		this.x = y;
	}
	//double distance(Point p) //returns distance between itself and the passes in point
	
	public double distance(Point p)
	{
		//sqrt((x1-x2)^2 + (y1-y2)^2)
		double distance = Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
		return distance;
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

}
