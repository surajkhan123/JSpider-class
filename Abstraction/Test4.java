abstract class A{
  abstract public void m1();
}
abstract class B extends A{
  abstract void m2();
}

class C extends B{
  @Override 
  public void m2(){
    System.out.println("m2()-C");
  }
  @Override
  public void m1(){
    System.out.println("m1()-C ");
  }
}
public class Test4 {
  public static void main(String[] args) {
    A a = new C();
    a.m1();
    // a.m2(); // CTE
    B b = new C();
    b.m1(); // m1()-C
    b.m2();// m2()-C

  }
}
