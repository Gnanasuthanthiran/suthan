import java.util.Scanner;

public class Positive{
	
	public static void main(String[] arg){
	Scanner in=new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		
		
		
		try{number=in.nextInt();
		
			
			if(number >= 1 )
			System.out.println(""+number+" is positive Integer");	
			else if(number <= 1 && number != 0)
			System.out.println(""+number+" is negative Integer");
			else if(number == 0)
				System.out.println("your Entering number is zero");
		}
		catch(Exception e){
				System.out.println(" Please enter Integer number only");
		}
		
		
		
	}
}
