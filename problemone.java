import java.io.*;
import java.util.Scanner;
public class problemone
{
	public static void main (String[] args) throws IOException
	{
	int start=1;
	int end=1;
	String inS;
	int guess=0;
	BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	// Read Interval: 
	while (end-start<3)
	{
	System.out.println("Enter the start of the interval ");
	inS = stdin.readLine();
	start = Integer.parseInt( inS );
	System.out.println("Enter the second number: ");
	inS = stdin.readLine();
	end = Integer.parseInt( inS );
		if (end-start<3) 
		{
		System.out.println("The interval does not contain at least 3 numbers, please enter a bigger interval");
		
		}
		
		
	}
	System.out.println("Think of a number between: "+ start+" and "+end);

	String input="0";
	
	while(!input.equals("y"))
	{
		if ((start+end)%2==0){
			guess=(start+end)/2;
		}
		else{
			guess=(start+end)/2+1;
				}
		System.out.println("Is the number :"+ guess + "? (y/h/l)");
		input = stdin.readLine();
		if (input.equals("l"))
		{
			end=guess-1;
		}
		else if (input.equals("h"))
		{
		start=guess+1;	
		}
			
	
		
		
	}
	
	System.out.println("End of program");
	
	}









}

	

	
		
	
		

	
	
