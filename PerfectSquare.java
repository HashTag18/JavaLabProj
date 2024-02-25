package ClgLabProj;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int num = 4567;
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
