//Abdi Elman D. A.
//import java.util.*;

public class hw{
	public static void main(String[] args){
		//Scanner scaner = new Scanner(System.in);
		if(args.length != 1){
			System.out.println("----");
		}
		//int score = scaner.nextInt();
		int score = Integer.parseInt(args[0]);
		String grade;
		if(score<=20)
		{
			grade = "E";
		}
		else if(score > 20 && score <= 40)
		{
			grade = "D";
		}
		else if(score >40 && score <= 60)
		{
			grade = "C";
		}
		else if(score >60 && score <=80)
		{
			grade = "B";
		}
		else{
			grade = "A";
		}

		System.out.println(grade);
	}
}