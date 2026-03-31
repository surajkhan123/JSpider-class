public class NeonNum2 {

  public static boolean m1(int n,int sq,int sum){
    if(sq==0)
    return n = sum;
    return m1(n, sq/10, sum*=sq);;

  }
  public static void main(String[] args){
    int n =9;
    System.out.println(m1(n,n+n,0));
  }
}