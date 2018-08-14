
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage: LetterGrade <numeric-score>");
			return;
		}
		
        int score = Integer.parseInt(args[0]);
        if(score > 80){
        	System.out.println("A");
        }
        else if(score > 60){
        	System.out.println("B");
        }
        else System.out.println("C");

        
	}

}
