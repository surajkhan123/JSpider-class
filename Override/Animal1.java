class A{
  public void m1(){
    System.out.println("m1()-A");
  }
}
class  B extends A {
    @Override
    public void m1(){
      System.out.println("m1()-B");
    }
  }
public class Animal1 {
  public static void main(String[] args) {
    B b = new B();
    b.m1(); // prints "m1()-B"
  }
  
}

// class A {
//     public void m1() {
//         System.out.println("m1()-A");
//     }
// }

// class B extends A {
//     @Override
//     public void m1() {
//         System.out.println("m1()-B");
//     }
// }

// public class Animal1 {
//     public static void main(String[] args) {
//         B b = new B();
//         b.m1();           // prints "m1()-B"
//     }
// }