
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage: LetterGrade <numeric-score>");
			return;
		}
		
        int n = Integer.parseInt(args[0]);
        int result = 1;
        for(int i=n;i>0;i--){
                result *= i;
        }
        
        System.out.println(result);
        }
}
