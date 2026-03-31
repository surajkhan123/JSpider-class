interface I1{
  void m1();
}
interface I2{
  void m2();
}
class B implements I1,I2{
  @Override
  public void m1(){
    System.out.println("m1()-B");
  }
  @Override
  public void m2(){
    System.out.println("m2()-B");

  }
}
public class E {
  public static void main(String[] args) {
    I1 i1 = new B();
    i1.m1(); // m1()-B
    I2 i2 = new B();
    i2.m2();
    
  }
}
