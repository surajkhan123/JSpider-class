package Blocks;

public class Static1 {
  static int i;
  int j;

  static {
    i =10;
  }
  public static void main(String[] args) {
	  System.out.println("Main Starts");
	  Car a = new Car();
	  System.out.println(i);
	  System.out.println(a.j);
	  System.out.println("Main Ends"); 
  } 
  static {
	  i =30;
	  int j = 40;// local veriable
  }
}
