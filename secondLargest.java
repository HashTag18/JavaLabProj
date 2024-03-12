package ClgLabProj;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        int[] a = new int[5];
        int l = 0;
        int Ltwo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int length = sc.nextInt();

        for (int j = 0; j < length; j++) {
            System.out.print("Enter element " + (j + 1) + ": ");
            a[j] = sc.nextInt();
        }
        int i = 0;
        while (i < a.length) {
            if (a[i] > Ltwo) {
                if (a[i] > l) {
                    Ltwo = l;
                    l = a[i];
                } else {
                    Ltwo = a[i];
                }
            }
            i++;
        }
        System.out.println("Largest Number : " + l);
        System.out.println("2nd Largest Number : " + Ltwo);
        sc.close();
    }
}
