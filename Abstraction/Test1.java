// public package Abstraction;

abstract class A{
  abstract public void m1();
}
class B extends A{
  @Override
  public void m1(){
    System.out.println("m1()-B");
  }
}

class Test1 {

  public static void main(String[] args) {
    // A a = new A(); // Abstract classes can't be instantiated,child class(B),store in parent reference.
    A a =new B();
    a.m1(); //m1()-B
    
  }
}