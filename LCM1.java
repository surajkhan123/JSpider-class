import java.util.Scanner;
public class LCM1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers");

    int a =sc.nextInt();
    int b = sc.nextInt();

    int max = (a>b) ? a:b;
    int lcm = max;

    while(lcm%a!=0 || lcm%b!=0){
      lcm = lcm+max;
      } 
     System.out.println("LCM No is: "+lcm);
    
  }
}
