package WrapperClass;

public class Test4 {
  public static void main(String[] args) {
    String s1 = "10";
    String s2 = "10.5";
    String s3 = "true";

    int i = Integer.parseInt(s1);
    double j = Double.parseDouble(s2);
    boolean k = Boolean.parseBoolean(s3);
    // Integer n = Integer.parseInt("10R");// NFE( Number Formal Exception)
    System.out.println(i+"\t"+j+"\t"+k);
  }
}
   
