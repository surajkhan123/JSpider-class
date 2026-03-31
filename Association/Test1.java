package Association;
class A{
  
}
class C{

}
class B{
  String s;
  A a;
  B(String s, A a)
  {
    this.s = s;
    this.a = a;
  }
  public void access(C c1)
  {
    System.out.println("C is Accessible");
  }
}

public class Test1 {
  public static void main(String[] args) {
    B b = new B("ABC", new A()); // Composition
    b.access (new C());  // Aggregation
  }
  
}
