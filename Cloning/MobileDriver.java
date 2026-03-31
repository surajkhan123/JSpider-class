package Cloning;

public class MobileDriver {
  public static void main(String[] args) throws CloneNotSupportedException{
    Mobile m1  = new Mobile("Oppo", 4, 128, "Blue", new Sim("Jio", 8695237780L));
    Mobile m2 = (Mobile) m1.clone();
    m2.s.name = "Airtel";

    System.out.println(m1);
    System.out.println(m2);
    
  }
}
