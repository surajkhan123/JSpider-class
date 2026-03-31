import java.util.Scanner;
public class AutoMorphic1 {
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n =sc.nextInt();
  // int n=5;
    int sq = n*n;

    boolean flag = true;
    while(n>0){
      if((n%10)!=(sq%10)){
        flag = false;
        break;
      }
      n=n/10;
      sq=sq/10;
    }
    if(flag) System.out.println("AutoMorphic Num.");
    else System.out.println("Not AutoMorphics");
  
  

  }
}
