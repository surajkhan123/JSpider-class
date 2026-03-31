public class FibonacciNum1Method {

  public static void fibonacciNum(int n){
    int start =0, end = 1;
    // int fi = start + end;

    // if(n>=1) System.out.println(start);

    // if(n>=2) System.out.println(end);
    
    System.out.println(start+" \n"+ end+" ");
    for(int i=2;i<=n;i++){
    int fi = start +end;
    System.out.println(fi);

    start = end;
    end = fi;
    }
  }
  public static void main(String[] args){
    int n =10;
    fibonacciNum(n);
    // System.out.println(fi);
  }
  
}
