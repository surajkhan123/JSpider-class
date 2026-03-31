public class ArmstrongNum1 {

    static int l;
    public static void main(String[] args) {
        int n = 153;
        l = (n+"").length();
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n) {
        return isArmstrong(n, n, 0);
    }
    public static boolean isArmstrong(int n, int m, int sum) {
        if (n == 0) 
            return m == sum;

        int digit = n % 10;
        sum += (int) Math.pow(digit, l);

        return isArmstrong(n / 10, m, sum);
    }
}
