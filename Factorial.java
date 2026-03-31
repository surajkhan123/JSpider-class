public class Factorial {
  public static void main(String[] args){
    int n = 5;
    int f= 1;
    for(int i =n;i>=1;i--){
      f*=i;
      
    }
    System.out.println("Fcatorial of "+n+"="+f);
  }
}
