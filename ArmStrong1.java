import java.util.Scanner;

public class ArmStrong1 {
  public static void main(String[] args){
    //ex:  153=> 1^3 + 5^3 + 3^3 = 153 
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 0;
    while(n>0){
      count++;
      n/=10;
    }
    System.out.println("count="+count);
    int sum =0;

    int m= n; 
    // int temp =n;
    while(n>0){
      int prod =1;
      int d = n%10;
      for(int i=1;i<=count;i++){
        prod*=d;
      } 
      sum+= prod;
      n/=10;
    }
    System.out.println("sum="+sum);
    if(sum ==m){
      System.out.println("ArmStrong Num:");
    } else{System.out.println("Not an Armstrong Num.");}
    sc.close();
  }
}
