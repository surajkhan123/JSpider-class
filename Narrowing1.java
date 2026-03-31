public class Narrowing1 {
  public static void main(String[] args) {
    int a =5;
    byte b =(byte)a;
    System.out.println(a+" "+b);

    double d = 9.5;
    int n =(int)d;
    System.out.println(d+" "+n);

    int m = 97;
    char ch=(char)m;
    System.out.println(m+" "+ch);
  }
}
