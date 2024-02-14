package ClgProject;
import java.util.Scanner;
public class ThreeNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter The 3 Numbers :");
		System.out.println("1:");
		a=sc.nextInt();
		System.out.println("2:");
		b=sc.nextInt();
		System.out.println("3:");
		c=sc.nextInt();
//		
//		Lenghty Code
//		if (a>b && a>c)
//			{
//						System.out.println(" Largest Num :"+a);
//					}
//				else if(b>c)
//					{
//						System.out.println(" Largest Num :"+b);
//					}
//		else
//			{
//			 System.out.println(" Largest Num :"+c);
//					}
//		
		int x=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Largest Num :"+x+".");
		sc.close();
			}
		
	}
	
