public class ScoreGradePrinter {
	public ScoreGradePrinter(Integer score){
		System.out.print("Your grade: ");
		if(score >= 0 && score <= 20){
			System.out.println("E");
			System.out.println("You Have to Study Extra Extra Hard!");
		} else if(score > 20 && score <= 40){
			System.out.println("D");
			System.out.println("You Have to Study Extra Hard!");
		} else if(score > 40 && score <= 60){
			System.out.println("C");
			System.out.println("You Have to Study Hard!");
		} else if(score > 60 && score <= 80){
			System.out.println("B");
			System.out.println("You Have to Study Harder!");
		} else if(score > 80 && score <= 100){
			System.out.println("A");
			System.out.println("You Have to Maintain Your Performance!");
		}
	}

	public static void main(String[] args){
		try{
			new ScoreGradePrinter(Integer.parseInt(args[0]));
		} catch(Exception e){
			System.out.println("Empty argument!");
		}
	}
}