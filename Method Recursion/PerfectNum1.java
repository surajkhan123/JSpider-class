// package Method Recursion;

public class PerfectNum1 {
  public static void main(String[] args)
  {
    int n =6;
    isPerfect(n, n/2, 0);

  }
  public static boolean isPerfect(int n,int i,int sum)
  {
    if(i==0) return n = sum;
    if(n%i==0) sum+=i;
    return isPerfect(n, i-1, sum);


  }
}
