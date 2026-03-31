package Association;
public class A{
  int i; int j;

  public  A(int i,int j){
    this.i=i;
    this.j=j;
  }
  @Override

  
  public String toString()
  {
    return i+","+j;
  }
 
   public static void main(String[] args) {
    A a1 = new A(10,20);
    System.out.println(a1.toString());
    A a2 = new A(30,40);
    System.out.println(a2);

  }
  
}
