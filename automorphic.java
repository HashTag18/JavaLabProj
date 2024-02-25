package ClgLabProj;
import java.util.Scanner;

public class automorphic {
	public static boolean IsNumber(int num) 
		{
			int Ldigit=(num*num)%10;
			int ldigit=num%10;
			return (ldigit==Ldigit);
			
		} 

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number You want to check : ");
		int num=sc.nextInt();
		boolean ans=IsNumber(num);
		if (ans)
			{
				System.out.println("The Number is Automorphic.");
			}
		else
			{
			System.out.println("The Number is Not Automorphic.");
			}
		sc.close();

	}

}
