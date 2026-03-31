import java.util.*;
public class GuessGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();

    int score=0;
    int guess=0;
    int r= (int)(Math.random()*9)+1;

    for (int i = 1; i <= 3; i++) {
         System.out.println("Enter your Guess: (between 1-9)");
         int n=sc.nextInt();
         if(n==r){
            score +=10;
            guess++;
             r= (int)(Math.random()*9)+1;
             System.out.println("Correct guess: "+guess+" , remaining chance: "+(3-i));
         }
         else if(n>r) System.out.println("Enter smaller number.");
         else if(n<r) System.out.println("Enter larger number.");
    }

    System.out.println("Hi "+name+" , Your Score is : "+score);
    sc.close();
  }
}
