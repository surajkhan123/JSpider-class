public class PrimeNum2 {
  public static void main(String[] args){
    int n =23;
    boolean isPrime = true;
    
     if(n<=1){
      isPrime = false;
     } else {
      for(int i=2;i<= Math.sqrt(n);i++){
        if(n%i==0){
          isPrime = false;
          break;

        }
      }
     } if(isPrime){
      System.out.println("true");
     } else{
      System.out.println("false");
     }
  }
}
