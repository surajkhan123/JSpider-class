interface Washable{
  // Marker
}
class Car implements Washable{

}
class Bike implements Washable{

}
class Mobile{

}
class Laptop{

}

public class H {
  public static void WashObj(Object o){
    if(o instanceof Washable)
      System.out.println("is");
  }
  public static void main(String[] args) {
    
  }
}
