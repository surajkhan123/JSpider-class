public class Car2 {
  String color;
  static int carNum =1000;
  int rgNum;

  Car2(String color){
    this.color = color;
    rgNum = carNum++;

  }

  public static void main(String[] args) {
    Car2 c1 = new Car2("Black");
    Car2 c2 = new Car2("White");

    System.out.println(c1.color+"\t"+ c1.rgNum);
    System.out.println(c2.color+"\t"+ c2.rgNum);

    c2.rgNum = 1111;
    System.out.println(c1.rgNum+"\t"+ c2.rgNum);
    
  }
}
