abstract class AA{
  abstract void m1();
}
abstract class BB extends AA{
  abstract void m1();
}

class CC extends BB{
  @Override
  public void m1(){
    System.out.println("m1()-CC");
  }
}

public class Test5 {
  public static void main(String[] args) {
    AA a = new CC();
    a.m1();
    BB b = new CC();
    b.m1();
    
  }
}
