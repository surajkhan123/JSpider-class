package Association;
public class B{
  int i; int j;

  public  B(int i,int j){
    this.i=i;
    this.j=j;
  }
  @Override
  public String toString()
  {
    return i+","+j;
  }
 
   public static void main(String[] args) {
    B a1 = new B(10,20);
    System.out.println(a1.toString());
    B a2 = new B(30,40);
    System.out.println(a2);

  }
  
}
