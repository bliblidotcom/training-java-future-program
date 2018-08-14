

public class FactorialRecursive {

	public static  int factorial(int n){
		if(n==1){
			return n;
		}
		else return n * factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage: LetterGrade <numeric-score>");
			return;
		}
		
        int n = Integer.parseInt(args[0]);
        int result = factorial(n);
        System.out.println(result);
        }
}
