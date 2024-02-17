package ClgLabProj;
import java.util.Scanner;
public class LeapYear {
	public static void IsLeap(int year) {
		if (year%4==0) 
		{
			if (year%100==0) 
			{
				if(year%400==0) 
				{
					System.out.println("The Year "+year+" Is a Leap year.");
					System.exit(0);
				}
				else
				{
					System.out.println("The Year "+year+" Is a Not Leap year.");
					System.exit(1);
				}
			}
			else
			{
				System.out.println("The Year "+year+" Is a Leap year.");
				System.exit(0);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Year want to check :");
		int year=sc.nextInt();
		IsLeap(year);
		sc.close();
	}

}
