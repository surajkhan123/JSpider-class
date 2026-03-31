import java.util.Scanner;
public class GCD_LCM1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers");

    int a =sc.nextInt();
    int b = sc.nextInt();

    int n1 = a; 
    int n2 = b;

    while(b!=0){
      int temp =b;
      b = a%b;
      a = temp;

    }
    int gcd = a;
    int lcm = (n1*n2)/gcd;
    System.out.println("GCD No is: "+gcd);
    System.out.println("LCM No is: "+lcm);
    
  }
}
 