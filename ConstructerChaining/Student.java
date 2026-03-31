package ConstructerChaining;

public class Student {
  String name;
  int age;
  int id;

  public Student(){

  }
  Student(String name){
    this.name=name;
  }

  Student(String name,int age){
    this(name);
    this.age = age;

  }
  Student(String name,int age,int id){
    this(name,age);
    this.id=id;
  }
  public void display(){
    System.out.println(name+" "+age+" "+id);
  }
  public static void main(String[] args) {
    Student s =new Student("Suraj",24,1);
    s.display();
  }
}
