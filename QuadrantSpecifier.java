package ClgLabProj;

import java.util.Scanner;

class QuadrantSpecifier {
    static Scanner sc = new Scanner(System.in);

    public static void Quadrant(double x, double y) {
        int z;
        if (x >= 0) {
            if (x == 0) {
                if (y == 0) {
                    System.out.println(" It is A Origin.");
                }
                else if (y > 0) {
                    System.out.println("It is on positive Y-Axis");
                }
                else {
                    System.out.println("It is on negative Y-Axis");
                }
            }
            else {
                if (y == 0) {
                    System.out.println(" It is on Positive X-Axis");
                }
                else if (y > 0) {
                    System.out.println("It is in Quadrant 1.");
                }
                else {
                    System.out.println("It is in Quadrant 4.");
                }
            }
        }
        else{
            if (y==0){
                System.out.println("It is on Negative X-axis");
            }
            else if (y>0){
                System.out.println("It is in Quadrant 2.");
            }
            else {
                System.out.println("It is in Quadrant 3.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Coordinates ");
        System.out.println("X coordinate : ");
        int X = sc.nextInt();
        System.out.println("Y coordinate : ");
        int Y = sc.nextInt();
        Quadrant(X, Y);
    }
}