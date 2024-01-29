
public class pokemon 
{
	protected int XP; // child can talk to protected 
	protected int level;
	protected String name;
	
	public pokemon(int a)
	{
		level = a;
	}
	
	public void levelUp()
	{
		level++;
		if(level >= 100)
		{
			level = 100;
			XP = 20000;
		}
	}
	public int getlevel()
	{
		return level;
	}
	
	public void addXP(int a)
	{
		XP += a;
		while(XP > 100*(Math.pow(2, level)))
		{
			levelUp();
		}
	}
	public int getXP()
	{
		return XP;
	}
	
	public void setName(String c)
	{
		name = c;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		double XPatLevelasDouble =100*(Math.pow(2, level));
		int XPatLevelasInt= (int) XPatLevelasDouble;
		String str = "";
		str += "\nXP : " + XP + " / " + XPatLevelasInt;
		str += "\nlevel: " + level + "\n";
		return str;
	}
	
	

}
