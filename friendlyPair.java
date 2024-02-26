package ClgLabProj;
import java.util.Scanner;

public class friendlyPair {

	public static int digitSum(int num)
		{
			int sum=0;
			for(int i =1;i<num;i++)
				{
					if (num%i==0) 
					{
						sum=sum+i;
					}
				}
			return sum;
		}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers");
		System.out.println("1:");
		int num1=sc.nextInt();
		System.out.println("2:");
		int num2=sc.nextInt();
		int num1sum1=digitSum(num1);
		int num2sum2=digitSum(num2);
		if((num1sum1/num1)==(num2sum2/num2))
			{
				System.out.println("The numbers "+num1 +" & "+num2+" are Friendly.");
			}
		else
			{
			System.out.println("The numbers "+num1 +" & "+num2+" are Not Friendly.");
			}
		sc.close();
	}

}
