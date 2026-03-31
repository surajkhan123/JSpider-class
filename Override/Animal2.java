class  A {
  public void m1(){
    System.out.println("m1()-A");
  }
}
class  B extends A  {
  public void m2(){
    System.out.println("m2()-B");
  } 
}
class  C extends B {
  @Override
  public void m1(){
    System.out.println("m1()-C");
  }
  @Override
  public void m2(){
    System.out.println("m2()-C");
  }
}

public class Animal2 {
  public static void main(String[] args) {
  C c=new C();
  c.m1();
  c.m2();
  
    
  }
}
