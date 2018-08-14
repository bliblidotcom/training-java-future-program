public class FaktorialRksf{
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		System.out.println(factorial(input));
	}
	public static int factorial(int n){
		if(n==1)
			return 1;
		else{
			return n*factorial(n-1);
		}	
	}
}