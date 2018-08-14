public class ForFactorial {
	public static void main (String[] args){
		if (args.length != 1) {
			System.err.println("ForFactorial <number>");
			return;
		}
		

		int number = Integer.parseInt(args[0]);
		long ansFactorial = 1;
		for (long i = 1; i <= number ; i++ ) {
			ansFactorial *= i;
		}
		System.out.println("Factorial: " + ansFactorial);
	}
}