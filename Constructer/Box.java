public class Box {

  int length; int breadth; int height;

  Box(int i){
    length = i;
    breadth = i;
    height = i;
  }

  Box(int length,int breadth,int height){
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  void display(){
    System.out.println(length+" "+breadth+" "+height);
  }
  public static void main(String[] args) {
    Box b = new Box(5);
    b.display();
    Box b1 = new Box(10,15, 20);
    b1.display();
  }
  
}
