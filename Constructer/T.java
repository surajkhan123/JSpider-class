public class T {
  {
    System.out.println("in Non-Static Block");
  }
  static
  {
    new T();
    System.out.println("in Non-Static Block");
  }
  T()
  {
    System.out.println("in Constructer");
    
  }
  public static void main(String[] args) {
    System.out.println("Main Start");
    System.out.println("Main Ends");
  }
}
