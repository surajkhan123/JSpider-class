package ConstructerChaining;

public class A {
  A(){
    System.out.println("A()-cons");
  }
  A(int i){
    this();
    System.out.println("A(int i)-const"+i);
  }
  A(int i,int j){
    this(30);
    System.out.println("A(int i,int j)-cons"+i+","+j);
  }
  public static void main(String[] args) {
    new A(10,20);
  }
  
}
