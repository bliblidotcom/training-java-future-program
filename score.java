public class score{
	public static void main(String[] args){
		if(args.length != 1){
			System.err.println("Usage: LetterGrade <numeric-number>");
			return;
		}
		int score = Integer.parseInt(args[0]);
				
		if(score <= 100){
			System.out.println("A");
		}
		else if(score <= 80){
			System.out.println("B");
		}
		else if(score <= 60){
			System.out.println("C");
		}
		else if(score <= 40){
			System.out.println("D");
		}
		else if(score <= 20){
			System.out.println("E");
		}
		else if(score <= 0){
			System.out.println("Drop Out");
		}
		else{
			System.out.println("Interval Nilai 0 - 100");
		}
		
	}	
}