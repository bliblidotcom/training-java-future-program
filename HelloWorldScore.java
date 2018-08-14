public class HelloWorldScore {
	public static void main(String[] args) {
		System.out.println("Hello World");

		if(args.length != 1){
			System.out.println("Wrong parameter input");
			return;
		}

		int score = Integer.parseInt(args[0]);

		if(score >= 1 && score < 20){
			System.out.println("Your score is E");	
		}
		else if(score >= 20 && score < 40){
			System.out.println("Your score is D");	
		}
		else if(score >=40 && score < 60){
			System.out.println("Your score is C");	
		}
		else if(score >=60 && score < 80){
			System.out.println("Your score is B");	
		}
		else if(score >=80 && score < 100){
			System.out.println("Your score is A");	
		}
		else{
			System.out.println("Your score is not identified");
		}
	}
}