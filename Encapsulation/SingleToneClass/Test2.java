package Encapsulation.SingleToneClass;

class B{
  private static B a;
  int i;

  private B(){
    i= 15;
    System.out.println("i="+i);

  }
  public static B getObject(){
    if(a==null) a = new B();
    return a;
  }

}

public class Test2 {
  public static void main(String[] args) {
    B a1 = B.getObject();
    B a2 = B.getObject();
    System.out.println(a1==a2);
    System.out.println(a1);
    System.out.println(a2);
  }
}
