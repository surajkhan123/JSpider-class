import java.util.*;
public class GuessGame2 {
  public static void main(String[] args){
    System.out.println("Enter  Your Name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    int r =(int)(Math.random()*9)+1;
    int score=0;
    int guess = 0;
    for(int i=1;i<=3;i++){
      System.out.println("Enter Your Guess NO(1-9): ");
      // Scanner scn = new Scanner(System.in);
      int n = sc.nextInt();
      score++;

      if(r==n){
        score+=10;
        r = (int)(Math.random()*9)+1;
      }
    }
    System.out.println("your score is: "+score);
  } 
}
