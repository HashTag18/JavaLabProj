package ClgLabProj;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,power,ans=1;
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		System.out.println("Enter The Power");
		power=sc.nextInt();
		for(int i=1;i<=power;i++)
			{
				ans=ans*num;
			}
		System.out.println(ans);
		sc.close();
		
	}

}
