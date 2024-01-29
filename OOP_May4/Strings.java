import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\apurs\\Documents\\AlexMay4th.txt");
		String s1 = "";
		String s2 = "";
		boolean inOrder = true;
		try {
			Scanner fileIO = new Scanner(f);
			
			if(fileIO.hasNext())
			{
				s1 = fileIO.next();
			}
			if(fileIO.hasNext())
			{
				s2 = fileIO.next();
			}
			int len;
			if(s2.length() < s1.length())
			{
				len = s2.length();
			}
			else
			{
				len = s1.length();
			}
			for(int i = 0; i<len; i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
				{
					
				}
				else if(s1.charAt(i) < s2.charAt(i))
				{
					break;
				}
				else
				{
					System.out.println("Not in order: " + s1 + " " + s2);
					inOrder = false;
				}
			}
			while(fileIO.hasNext())
			{
				s1 = s2;
				s2 = fileIO.next();
				for(int i = 0; i<len; i++)
				{
					if(s1.charAt(i) == s2.charAt(i))
					{
						
					}
					else if(s1.charAt(i) < s2.charAt(i))
					{
						break;
					}
					else
					{
						System.out.println("Not in order: " + s1 + " " + s2);
						inOrder = false;
					}
				}
				
			}
			if(inOrder)
			{
				System.out.println("True");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
