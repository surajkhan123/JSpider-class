package Cloning;

public class Test {
  public static void main(String[] args) throws Exception {
    Sim s1 = new Sim("Jio", 8695237780L);
    Sim s2 = (Sim) s1.clone();

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1==s2);
  }
}
