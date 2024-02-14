package ClgLabProj;
import java.util.Scanner;

public class swapping {
	
	static void swap(float a,float b) 
	{
		float temp=a;
		a=b;
		b=temp;
		System.out.println("First Number = "+a+"Second Number"+b);		
		
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 Numbers :");
	System.out.print("1:");
	float a=sc.nextFloat();
	System.out.print("2:");
	float b=sc.nextFloat();
	
	swap(a,b);
	
	}

}
