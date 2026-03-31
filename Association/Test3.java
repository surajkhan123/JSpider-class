package Association;
// Object class using two string method
class Student
{
  int id;
  String name;
  public Student(int id, String name){
    this.id = id;
    this.name=name;

  }
  @Override
  public String toString(){
    return "id="+ id+" name="+name;
  }
}
public class Test3 {
  public static void main(String[] args) {
    Student s1 = new Student(1,"Suraj");
    System.out.println(s1);
    Student s2 = new Student(2,"Salman" );
    System.out.println(s2);
    
  }
}
