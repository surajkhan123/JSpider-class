public class Student {
  String name;  int age; int id;

  public Student(String name,int age, int id){
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public void display(){
    System.out.println(name+"\n"+age+"\n"+id);
  }

  public static void main(String[] args){
    Student s1 = new Student("Abc", 29,1);
    s1.display();
    Student s2 = new Student("Xyz", 30,2);
    s2.display();
  }
}
