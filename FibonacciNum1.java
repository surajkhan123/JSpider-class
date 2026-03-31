public class FibonacciNum1 {
  public static void main(String[] args){
    int start = 0;
    int end = 1;
    int n = 10;
    
    System.out.println(start+" \n"+end+" ");
    for(int i=2;i<=n;i++){
      int next = start+ end;
      System.out.println(next);
      start = end; //shifting, first becomes second
      end = next; //shifting, second becomes last

    }
  }
}