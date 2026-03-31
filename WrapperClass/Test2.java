package WrapperClass;

public class Test2 {
  public static void main(String[] args) {
    Integer a =10;
    int b = a; // Auto-Unboxing

    System.out.println("Non-Primitive(Wrapper): "+a);
    System.out.println("Primitive: "+b);

    Integer c = 20;
    int d = c.intValue(); // UnBoxing before JDK 1.5
    System.out.println("Non-Primitive(Wrapper): "+c);
    System.out.println("Primitive: "+d);

    int n = new Integer(30);
    System.out.println("Primitive: "+n);
  }
}
