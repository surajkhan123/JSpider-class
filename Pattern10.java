public class Pattern10 {
    public static void main(String[] args){
      // int r =5;
      // int c = 7;
      int n=5;
      for(int i =5;i>=1;i--){
        for(int j=i;j>=1;j--){
          System.out.print(j);
          if(j>1)
            System.out.print(" * ");
        }
        System.out.println();
      }
    }
}
