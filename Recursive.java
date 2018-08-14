import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        if(args.length < 1)
        {}
        else{
            int score = Integer.parseInt(args[0]);
            int hasilFactorial = score;
            System.out.println(scoring(hasilFactorial, score));
        }
        
    }

    public static int scoring(int hasilFactorial, int score)
    {
        score--;
        if(score == 0)
            return (hasilFactorial);
        else
        {
            hasilFactorial *= score;
        }
        return scoring(hasilFactorial, score);
    }
}
