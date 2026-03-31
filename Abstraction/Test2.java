// package Abstraction;

abstract class A{
  abstract public void m1();
  abstract public void m2();

  public void m3(){
    System.out.println("m3()-A");
  }
}

class B extends A{
  @Override
  public void m1(){
    System.out.println("m1()-B");
  }
  @Override
  public void m2(){
    System.out.println("m2()-B");
  }
}

public class Test2 {
  public static void main(String[] args) {
    // A a = new A(); //CTE
    A a = new B();
    a.m1();
    a.m2();
    a.m3();
    
  }
}
