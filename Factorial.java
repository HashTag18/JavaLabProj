
package ClgLabProj;
import java.util.Scanner;

public class Factorial {
	public static int fact(int num) 
	{		
		int i=1;
		int fact=1;
		if(num ==0 || num==1)
				{
					System.out.println("Factorial = 1");
					System.exit(0);
				}
		else
			{
				for(i=num;i>=1;i--) 
				{
					fact=fact*i;
				}
			}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The Number Of Which you Want THe Factorial :");
		int num=sc.nextInt();
		int facto=fact(num);
		System.out.println(facto);
		sc.close();
	}

}



//int i,fact=1;  
//int number=5;//It is the number to calculate factorial    
//for(i=1;i<=number;i++){    
//    fact=fact*i;    
//}    
//System.out.println("Factorial of "+number+" is: "+fact);
