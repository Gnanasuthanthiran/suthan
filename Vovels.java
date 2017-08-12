import java.util.Scanner;

public class Vovels{
	
	public static void main(String[] arg){
	String vowels =new String();
	String consonent=new String();
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your String  ");
		
 		String words=new String(in.nextLine());
		
		int  letter;
		int v_count=0,c_count=0;
		
		for(int i=0;i<words.length();i++){
			letter=(int)words.charAt(i);
			if( (letter == 97) ||(letter == 101)||(letter == 105)||(letter == 111)||(letter == 117)
				||(letter == 65) ||(letter == 69)||(letter == 73)||(letter == 79)||(letter == 85))
				{
					vowels=vowels+words.charAt(i);
					v_count++;
				}
			else if(
			(
			(
			(letter >= 65)&&(letter <= 90)
			)
			||
			(
			(letter >= 97)&&(letter <= 122)
			)
			&&
			(
			(letter != 97)|| (letter != 101)||(letter != 105)||(letter != 111)||(letter != 117)
				||(letter != 65) ||(letter != 69)||(letter != 73)||(letter != 79)||(letter != 85))))
				{
					consonent=consonent+words.charAt(i);
					c_count++;
				}
				
		}
		
	System.out.println(v_count +" Vowels : "+vowels);
	System.out.println(c_count+" consonent : "+consonent);
	
	}
}
