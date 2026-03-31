public class PatternPrimeNum1 {
  public static void main(String[] args) {
    int n =4; int num=2;

    for(int i=0;i< n;i++){
      for(int j =0;j<=i;j++){
        while(!isPrime(num))
          num++;
        {
          System.out.print(num+" ");
          num++;
        }
    } System.out.println();
  }

  }
    public static boolean isPrime(int n){
    if(n<=1) return false;
    for(int i=2;i<n;i++)
    if(n%i==0){
      return false;
    }
    return true;
  }
}
