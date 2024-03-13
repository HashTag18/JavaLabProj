package ClgLabProj;

import java.util.Scanner;

public class ChairPermutation extends Factorial {
    static Scanner sc = new Scanner(System.in);

    static int permutation(int x, int y) {
        Factorial fact = new Factorial();
        return (fact(x)) / (fact(x - y));
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of Students : ");
        int s = sc.nextInt();
        System.out.println("Enter the number of Seats : ");
        int t = sc.nextInt();
        int permute = permutation(s, t);
        System.out.println("Number of permutations : " + permute);
    }
}
