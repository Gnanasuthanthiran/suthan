import java.util.Scanner;

public class OddEven_Intervals{
	
	
	public static void main(String[] arg){
	Scanner in=new Scanner(System.in);
		int start,end;
		int odd=0,even=0;
	
		int i,j;
		System.out.printf("Enter Stating point of number :  ");
		start=in.nextInt();
			System.out.printf("Enter Stating End of number : ");
		end=in.nextInt();
		
	
			
		if((start > 0) && (end > 0)) 
		{
		System.out.printf("\n\nOdd numbers are  : ");
				for(j=start;j<=end;j++){
					if((j%2)!=0){
						System.out.printf(" %d",j);
						odd++;
						}
				}
		
		
				System.out.printf("\n\nEven numbers are  : ");
				for(i=start;i<=end;i++){
					if((i%2)==0){
						System.out.printf(" %d",i);
						even++;
						}
				}


			System.out.println("\n\n"+start+" to "+end+" \n"+even+ " even number(s) \n"+odd+" odd number(s)");
			
		}
		
		else{
				System.out.printf("\n\nEnter Only positive integer  \n\n");
		}
		
		
			
		

		
	
}
	
}