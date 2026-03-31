package WrapperClass;

public class Test3 {
  public static int m1(){
    return new Integer(10);
   } // AutoBoxing
  public static Integer m2(){
    return 10;
  } 
  public static void m1(int a){
    System.out.println("m1(int i): "+a);
  }
  public static void m1(Object a){
    System.out.println("m1(Object i): "+a);
  }
  
  public static void main(String[] args) {
    int a =10;
    Integer b = 20;

    m1(a);
    //m1(b);
    
  }
}
