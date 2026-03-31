package Encapsulation.SingleToneClass;

class A{
  int i;
  private A(){
    i =15;
    System.out.println("i ="+i);

  }
  public static A getObject(){
    return new A();
  }
}

public class Test1 {
  public static void main(String[] args) {
    A a1 = A.getObject();
    A a2 = A.getObject();
    System.out.println(a1==a2);
    System.out.println(a1);
    System.out.println(a2);

  }
  
}
