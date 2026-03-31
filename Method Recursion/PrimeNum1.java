// With Range
public class PrimeNum1 {
  public static void main(String[] args){
    // int n=101;
    range(1,100);
    // System.out.println(isPrime(n,n/2));

  }
  public static void range(int st,int end){
    if(st>end) return;
    if(isPrime(st, st/2)){
      System.out.println(st+" ");
    } range(st+1, end);
  }
  public static boolean isPrime(int n,int i){
    if(i==1)return true;
    if(n<=1||n%i==0) return false;
    return isPrime(n, i-1);
  }
}
