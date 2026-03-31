class PalindromeNum1{
  public static void main(String[] args){
    int n =2002;
  }
  public static boolean isPalindrome(int n){
    int m = n;
    int rev =0;
    while(m>0){
      rev =(rev*10)+(m%10);
      m /=10;
    }


  }
}