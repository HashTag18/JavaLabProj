import java.util.Scanner;

public class billCounter {
    static Scanner sc = new Scanner(System.in);

    public static double above15(double value) {
        return value * 0.90;
    }

    public static double between12to15(double value) {
        return value * 0.94;
    }

    public static double between9to12(double value) {
        return value * 0.97;
    }

    public static double below9(double value) {
        return value * 0.99;
    }

    public static void main(String[] args) {
        System.out.println("Enter The number of products you have purchased : ");
        double sum = 0, sum1 = 0;
        int product_num = sc.nextInt();
        int i = 1;
        while (i <= product_num) {
            System.out.println(i + " : Enter Value");
            double value = sc.nextDouble();
            int ch = (value <= 9000) ? (1) : ((value <= 12000) ? (2) : ((value <= 15000) ? (3) : (4)));
            double value1 = value;
            switch (ch) {
                case 1:
                    value1 = below9(value);
                    break;
                case 2:
                    value1 = between9to12(value);
                    System.out.println("The Value after Discount 1 : \n " + value1);
                    break;
                case 3:
                    value1 = between12to15(value);
                    System.out.println("The Value after Discount 2 : \n " + value1);
                    break;
                case 4:
                    value1 = above15(value);
                    System.out.println("The Value after Discount 3 : \n " + value1);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }
            sum1 += value;
            sum += value1;
            i += 1;
        }
        System.out.println("Your Original Value : " + sum1);
        System.out.println("Your Discounted Value : " + sum);
        System.out.println(" Exiting Program .  ..  ...");
    }
}
