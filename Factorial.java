public class Factorial {
	public static void main(String[] args) {
		System.out.println("Hello World");

		if(args.length != 1){
			System.out.println("Wrong parameter input");
			return;
		}

		int number = Integer.parseInt(args[0]);
		int value=1;

		for(int i=1; i<=number; i++){
			value *= i ;
		}

		System.out.println("Factorial value: "+ value);
	}
}