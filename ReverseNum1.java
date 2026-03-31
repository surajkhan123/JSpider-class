import java.util.Scanner;

public class ReverseNum1 {
  public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    int rev = 0;
    while(n>0){
      rev = (rev*10)+(n%10);
      n/=10;
    }
    System.out.println(rev);
  }
}
