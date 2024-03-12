import java.util.Scanner;

public class Table {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter The number Of which the table You want : ");
        int x= sc.nextInt();
        System.out.println("Table of "+ x +" : \n ");
        int i=1,mul;
        while(i<=10){
            mul=i*x;
            System.out.println(i+" * "+x+" : "+mul);
            i++;
        }
    }
}
