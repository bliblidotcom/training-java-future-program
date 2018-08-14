import java.util.Scanner;

public class Score {
	public static void main(String[] args){

		int score = Integer.parseInt(args[0]);

		Scanner in = new Scanner(System.in);
		
		//int score = 100;

		//score = in.nextInt();

		if (score>80) {
			System.out.println("A");
		} else if (score>60) {
			System.out.println("B");
		} else if (score>40) {
			System.out.println("C");
		} else if (score>20) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}