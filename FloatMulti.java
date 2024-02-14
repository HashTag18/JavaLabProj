package ClgLabProj;
import java.util.Scanner;
public class FloatMulti {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 Numbers :");
		System.out.print("1:");
		float a=sc.nextFloat();
		System.out.print("2:");
		float b=sc.nextFloat();
		
		float c=a*b;
		
		System.out.println("The Multiplication is : "+c);

	}

}
