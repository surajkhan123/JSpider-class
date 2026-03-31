class Narrowing2
{
  public static void main(String[] args){
    System.out.println(m1());// 9
    System.out.println(m2());//10.0

  }
  public static int m1(){
    return (int)9.5; // double to int(Narrowing)
  }
  public static double m2(){
    return 10; // int to double (Widening)
  }
}