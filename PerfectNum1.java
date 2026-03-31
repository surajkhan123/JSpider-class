public class PerfectNum1 {
  public static void main(String[] args) {
    int n =100;
    int sum =0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        sum=sum+i;
      }
    }
      if(sum==n){
        System.out.println(n+" is Perfect No");
      }
       else{
        System.out.println(n+" is Not Perfect No");
      }
  }
}
  

