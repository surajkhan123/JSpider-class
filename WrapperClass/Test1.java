package WrapperClass;
// -------------------------Auto Boxing-------------------------
public class Test1 { 
  public static void main(String[] args) {
  byte a =10;
  Byte b =a; // Auto-boxing
  
  System.out.println("Primitive Type: "+a);
  System.out.println("Wrapper(Non-Primitive): "+b);

  int c = 20;
  Integer d = Integer.valueOf(c);  // Boxing before JDK 1.5

  System.out.println("Primitive Type: "+c);
  System.out.println("Wrapper(Non-Primitive): "+d);

  Integer n = 30;
  System.out.println("Wrapper(Non-Primitive): "+n);
  }
  
}
