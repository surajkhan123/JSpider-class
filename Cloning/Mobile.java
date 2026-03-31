package Cloning;

public class Mobile implements Cloneable{
  String name;
  int ram;
  int rom;
  String color;
  Sim s; // Has-a (Aggrigation)

  public Mobile(String name,int ram,int rom,String color,Sim s){
    this.name = name;
    this.ram = ram;
    this.rom = rom;
    this.color = color;
    this.s = s;
  }
  @Override
  public String toString(){
    return "Mobile[name="+ name +", ram="+ ram +", rom="+ rom +", color="+ color +", sim="+ s +" ]";
  }
  @Override
  public Object clone() throws CloneNotSupportedException{
    Mobile m = (Mobile) super.clone();
    return m;
  }
  
}
