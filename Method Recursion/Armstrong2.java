public class Armstrong2 {
    static int l;

    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        for (int i = start; i <= end; i++) {
            l = (i + "").length();
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
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


