import java.util.InputMismatchException;
import java.util.Scanner;

public class April22 
{

	public static void main(String[] args) 
	{
		//create a simple calculator, that gives displays a non error
		// message if the user enters a non number
		System.out.println(calculator());
	
	}
	
	public static double calculator()
	{
		Scanner scan = new Scanner(System.in);
		int num1=0;
		int num2 =0;
		char ch = '+';
		try
		{
			System.out.println("enter a number: ");
			num1 = scan.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("That is not a number");
		}
		try
		{
			System.out.println("enter a '*', '-', '+', or '/': ");
			ch = scan.next().charAt(0);
		}
		catch(InputMismatchException e)
		{
			System.out.println("That is not a number");
		}
		try
		{
			System.out.println("enter another number: ");
			num2 = scan.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("That is not a number");
		}
		if(ch=='-')
		{
			return num1-num2;
		}
		else if(ch == '+')
		{
			return num1+num2;
		}
		else if(ch == '*')
		{
			return num1*num2;
		}
		else
		{
			return num1/num2;
		}
	}
	
	public static int number()
	{
		int num = -9;
		try
		{
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not a number");
		}
		return num;
	}

}