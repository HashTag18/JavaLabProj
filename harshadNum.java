package ClgLabProj;
import java.util.Scanner;

public class harshadNum {
	
	public static boolean checkNum(int num)
		{
			int num2=num;
			int num3=num;
			while(num3>0)
				{
					num3/=10;
					num2%=10;
					
				}
			return ((num%num2)==0);
		}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The number You want to check : ");
		int num=sc.nextInt();
		boolean ans=checkNum(num);
		if(ans)
			{
				System.out.println("The number is a Harshad Number.");
			}
		else 
			{
				System.out.println("The number is Not a Harshad Number.");
			}
		sc.close();

	}

}
