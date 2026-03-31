public class Factorial1 {
  public static void main(String[] args){
    fact(5,1);

  }
  public static void fact(int n,int fact){
    if(n==0)
    {
      System.out.println(fact);
      return;
    }
    fact*=n;
    fact(n-1,fact);
  }
}
