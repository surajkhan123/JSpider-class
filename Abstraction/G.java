interface Regulator{
  void increaseSwitch();
  void decreaseSpeed();

}
interface Switch{
  void on();
  void off();
}

class Fan implements Regulator, Switch{
  @Override
  public void on(){
    System.out.println("Fan is On");
  }
  @Override
  public void off(){
    System.out.println("Fan is Off");
  }
  @Override
  public void increaseSwitch(){
    System.out.println("Speed Increase");
  }
  @Override
  public void decreaseSpeed(){
    System.out.println("Speed Decrease");
  }

}

public class G {
  public static void main(String[] args) {
    Regulator r = new Fan();
    r.increaseSwitch();
    r.decreaseSpeed();
    // r.on();  // CTE
    // r.off(); // CTE
    Switch s = new Fan();
    s.on();
    s.off();
    // s.increaseSwitch();  // CTE
    // s.decreaseSpeed();   // CTE

    
  }
}
