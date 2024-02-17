package ClgLabProj;
import java.util.Scanner;
class Prime {

	static void prime_N(int N)
	{
		int x, y, flg;

		System.out.println(
			"All the Prime numbers within 1 and " + N
			+ " are:");

		for (x = 1; x <= N; x++) {

			if (x == 1 || x == 0)
				continue;

			flg = 1;

			for (y = 2; y <= x / 2; ++y) {
				if (x % y == 0) {
					flg = 0;
					break;
				}
			}

			if (flg == 1)
				System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number Until You want the prime numbers:");
		int N = sc.nextInt();

		prime_N(N);
		sc.close();
	}
}
