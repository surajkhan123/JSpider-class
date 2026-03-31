package Cloning;

public class Sim implements Cloneable {
  String name;
  long num;

  public Sim(String name, long num){
    this.name = name;
    this.num = num;
  }
  @Override
  public String toString(){
    return "Sim [name="+ name +", num=" + num +"]";

  }
  @Override
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
  
}
