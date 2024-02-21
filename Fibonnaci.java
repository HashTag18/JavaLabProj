package ClgLabProj;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		
	Scanner sc=	new Scanner(System.in);
	System.out.println("Enter the Number you want To print Fibounacci : ");
	int num=sc.nextInt();
	int a=0;
	int b=1;
	System.out.print
	(a+","+b+",");
	int NextNum;
	
	for (int i=0;i<=num-2;i++) //To cut out 1 and 0 that are already printed
		{
			NextNum=a+b;
			a=b;
			b=NextNum;
			System.out.print(NextNum+",");
		}
		sc.close();
	}

}
