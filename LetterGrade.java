import java.util.*;

public class LetterGrade
{
	public static void main(String args[])
	{
		if (args.length != 1){
			System.out.println("Usage LetterGrade <numeric-score>");
			return;
		}
		int score = Integer.parseInt(args[0]);
		/*
		Scanner scan = new Scanner(System.in);

		System.out.print("Score = ");

		score = scan.nextInt();
		*/
		if (score > 80){
			System.out.println("Grade = A");
		}
		else if (score > 70){
			System.out.println("Grade = B");
		}
		else if (score > 60){
			System.out.println("Grade = C");
		}
		else{
			System.out.println("Grade = D");
		}
	}
}