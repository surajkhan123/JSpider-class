package Association;
// Object class toString() method
class Student{
    String name;
    int id;

    public Student(int id,String name){
      this.id=id;
      this.name= name;
    }
    @Override
    public String toString(){
      return "id="+id+" name="+name;
    }
  }

public class Test4 {
  public static void main(String[] args) {
    Student s1 = new Student(1,"Suraj");
    System.out.println(s1);
    Student s2 = new Student(2,"Suraj");
    System.out.println(s2);
    
  }
  
}
