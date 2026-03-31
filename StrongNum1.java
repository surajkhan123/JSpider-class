public class StrongNum1 {
  public static void main(String[] args) {
    // 145 => 1! =1 + 4!= 24 + 5! = 120 => 145

    int n = 145;
    int m = n;
    int sum =0;
    while(n>0){
      int d = n%10;
      int prod = 1;
      for(int i =1;i<=d;i++){
        prod *=i;
      }
      sum += prod;
      n/=10;
    } if(sum ==m){
      System.out.println("Strong No");
    } else {System.out.println("Not Strong No");
  }
  }
}
