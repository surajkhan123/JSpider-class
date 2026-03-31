public class PrimePattern2 {
  public static void main(String[] args) {

    int n = 5;
    int i = 0;
    int num = 2;

    while(i < n){
      int j = 0;

      while(j <= i){

        while(!isPrime(num)){
          num++;
        }

        System.out.print(num + " ");
        num++;
        j++;
      }

      System.out.println();
      i++;
    }
  }

  public static boolean isPrime(int n){
    if(n <= 1) return false;

    int i = 2;
    while(i * i <= n){
      if(n % i == 0) return false;
      i++;
    }
    return true;
  }
}