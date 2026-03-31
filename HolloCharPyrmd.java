public class HolloCharPyrmd {
  public static void main(String[] args) {
    int n=4;
    char ch ='A';
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++)
     System.out.print("  ");
    {
    for(int k=1;k<=i*2-1;k++)
      if(i==n||k==1||k==(i*2-1)){
        System.out.print(ch+" ");
        ch++;
      } else {
        System.out.print("_ ");
      }
    }
    System.out.println();
    }
  }
}
