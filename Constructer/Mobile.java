public class Mobile {
  String name;
  int ram;
  int rom;
  String color;
  Mobile(){

  }
  Mobile(String name,int ram,int rom,String color){
    this.name = name;
    this.ram=ram;
    this.rom=rom;
    this.color=color;
  }
  Mobile(Mobile mob){
    this.name=mob.name;
    this.ram=mob.ram;
    this.rom=mob.rom;
    this.color=mob.color;
  }

  public static void main(String[] args){
    Mobile mob=new Mobile("Oppo",6,128,"white");

    System.out.println(mob.name+" "+mob.ram+" "+mob.rom+" "+mob.color);
  }
  
}
