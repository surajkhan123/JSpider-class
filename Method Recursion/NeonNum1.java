public class NeonNum1 {

  public static Neon(int n,int sum){
    if(n==0){
      return 0;//false;
      return(n%10)+(int)sum(n/10);
    }
    
  }
  public static void main(String[] args){
    int n= 9;
    int sq =n*n;
    int sum=0;

    sum+=sq%10;
    sq/=10;


    if(sum==n){
      System.out.println("Neon Num");
    } else System.out.println("Not Neon no");


  }


}
