import java.util.Scanner;

public class Scoring {

    public static void main(String[] args) {
        if(args.length < 1)
        {}
        else{
            int score = Integer.parseInt(args[0]);
            scoring(score);
        }
        
    }

    public static void scoring(int score)
    {
        if(score > 80)
        {
            System.out.println("    Score is A");
        }
        else if(score > 60)
        {
            System.out.println("    Score is B");
        }
        else if(score > 40)
        {
            System.out.println("    Score is C");
        }
        else if(score > 20)
        {
            System.out.println("    Score is D");
        }
        else
        {
            System.out.println("    Score is E");
        }
    }
}
