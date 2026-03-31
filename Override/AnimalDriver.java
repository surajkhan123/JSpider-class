class Animal {
  public void sound(){
    System.out.println("Animal-sound");
  }

}
class Dog extends Animal{
  @Override
  public void sound(){
    System.out.println("Bow Bow..");
  }
}
class BabyDog extends Dog{
  @Override
  public void sound(){
    System.out.println("Cute-Bark");
  }
}
class Cat extends Animal{
  @Override
  public void sound(){
    System.out.println("Meow Meow..");
  }
}
public class AnimalDriver {
  public static void main(String[] args){
    Animal a = new Animal();
    a.sound();
    Dog d = new Dog();
    d.sound();
    BabyDog c = new BabyDog();
    c.sound();
  }

  
}