
public class Box 
{
	int x;
	int y;
	int width;
	int height;
	int vx;
	int vy;
	
	public Box(int x, int y, int vx, int vy, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.height = height;
		this.width = width;
	}
	
	public void handleBoxHit(Box b2)
	{
		int [] dir = getHitDirection(b2);
		
		if(dir[0]==-1)
		{
			x = b2.x-b2.width;
			vx*=-1;
		}
		if(dir[0]==1)
		{
			x = b2.x + width;
			vx*= -1;
		}
		if(dir[1]==-1)
		{
			y = b2.y+ b2.height;
			vy *=-1;
		}
		if(dir[1]==1)
		{
			y = b2.y-height;
			vy *= -1;
		}
		
		
	}
	
	
	public void checkBoundHit(int screenHeight, int screenWidth)
	{
		int [] dir = {0, 0};
		if((y>screenHeight-height) )
		{
			dir[1]=1;
		}
		if(y<0)
		{
			dir[1]=-1;
		}
		if((x>screenWidth-width))
		{
			dir[0]=1;
		}
		if(x<0)
		{
			dir[0]=-1;
		}
		handleBoundHit(dir, screenHeight, screenWidth);
	}
	
	public void handleBoundHit(int [] dir, int screenHeight, int screenWidth)
	{
		if(dir[0]==-1)
		{
			x= 0;
			vx *= -1;
		}
		if(dir[0]==1)
		{
			x = screenWidth-width;
			vx *= -1;
		}
		if(dir[1]==-1)
		{
			y = 0;
			vy *= -1;
		}
		if(dir[1]==1)
		{
			y = screenHeight-height;
			vy *= -1;
		}
	
		
	}
	
	public int [] getHitDirection(Box b2)
	{
		int [] result = {0, 0};
		
		double dTop = Math.abs(y - (b2.y+b2.height));
		double dBottom = Math.abs((y + height)-b2.y);
		double dLeft = Math.abs(x - (b2.x+b2.width));
		double dRight = Math.abs((x+width) - b2.width);
		
		if((dTop<=dRight&&(dTop<=dLeft)&&dTop<dBottom))
		{
			//top
			
			if(dTop==dRight)
			{
				//right corner
				result[0] = 1;
			}
			else if(dTop==dLeft)
			{
				//leftCorner
				result[0] = -1;
			}
			result[1]= -1;
		}
		else if((dBottom<=dRight)&&(dBottom<=dLeft))
		{
			//bottom
			if(dBottom == dRight)
			{
				//bottom right corner
				result[0] = 1;
			}
			else if(dBottom == dLeft)
			{
				//bottom left corner
				result[0] = -1;
			}
			result[1] = 1;
		}
		else if(dRight<dLeft)
		{
			//right
			result[0]= 1;
		}
		else
		{
			//left
			result[0] = -1;
		}
		return result;
	}
	
	public boolean checkBoxHit(Box b2)
	{
		if(x<b2.x+b2.width && b2.x <= x + width && y < b2.y+b2.height && y + height> b2.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void moveIt()
	{
		x = x+vx;
		y = y+vy;
	}
}
