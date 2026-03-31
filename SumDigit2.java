public class SumDigit2 {
  public static void main(String[] args){
    int n = 25;
    System.out.println(sumOfDigit(n));

  }
  public static int sumOfDigit(int n){
    int sum =0;
    while(n>0){
      
    int last = n%10;
    sum = sum +last;
    n/=10;
    
    }
    return sum;
  }
}
