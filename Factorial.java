import java.util.Scanner;

public class Factorial{


  public static void main(String[] args) {
    if(args.length != 1){
      System.out.println("Usage :");
      System.out.println("javac Factorial <number>");
      return;
    }
    int number = Integer.parseInt(args[0]);
    int result = 1;
    while(number > 1){
      result *= number;
      --number;
    }
    System.out.println("hasil: "+result);

  }

}
