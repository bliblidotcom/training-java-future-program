import java.util.Scanner;

public class Iteration {

    public static void main(String[] args) {
        if(args.length < 1)
        {}
        else{
            int score = Integer.parseInt(args[0]);
            System.out.println(scoring(score));
        }
        
    }

    public static int scoring(int score)
    {
        int hasilFactorial = score;
        for(int i = score; i > 0; i--)
        {
            if(i > 1)
                hasilFactorial *= (i-1);
        }
        return hasilFactorial;
    }
}
