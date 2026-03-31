interface I1{
  void m1();

}
interface I2{
  void m2();

}

abstract  class A{
  abstract void m3();
}

class B extends A implements I1,I2 {
  @Override
  public void m1(){
    System.out.println("m1()-B");

  }
  @Override
  public void m2(){
    System.out.println("m2()-B");
  }

  @Override
  public void m3(){
    System.out.println("m3()-B");
  }
}


public class F {
  public static void main(String[] args) {
    I1 i1 = new B();  // upcasting B to I1
    i1.m1();
    B b = (B) i1;     // downcasting I1 to B
    b.m1();
    b.m2();
    b.m3();
    
  }
}
