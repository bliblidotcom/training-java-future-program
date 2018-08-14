import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        if(args.length < 1)
        {}
        else{
            int score = Integer.parseInt(args[0]);
            int hasilFactorial = score;
            System.out.println(scoring(score));
        }
        
    }

    public static int scoring(int score)
    {
        if(score > 0)
            return score * scoring(score-1);
        return score;
    }
}
