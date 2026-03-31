// package Encapsulation;
class Student{
  private int id;
  private String name;

  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
}

public class StudentTest1 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setId(123);
    s1.setName("abc");
    System.out.println(s1.getId());
    System.out.println(s1.getName());
  }
}
