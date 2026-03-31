public class NeonNum1 {
  public static void main(String[] args) {
    int n= 9;
    int sqr = n*n;
    int sum =0;

    while(sqr>0){
      sum +=sqr%10;
      sqr/=10;
    }
    if (sum==n) System.out.println(n+ " is a Neon Num");
    else System.out.println(n+" is not a Neon Num");
  }
}
