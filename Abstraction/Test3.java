abstract class A{
  abstract public void m1();
  abstract public void m2();
}
abstract class B extends A{
  @Override
  public void m1(){
    System.out.println("m1()-B");
  }
}
abstract class C extends B{

}

class D extends C{
  @Override
  public void m2(){
    System.out.println("m2()-D");
  }
}

public class Test3 {
  public static void main(String[] args) {
    A a =new D();
    a.m1();
    a.m2();
    
  }
}
