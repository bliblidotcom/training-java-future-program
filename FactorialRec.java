public class FactorialRec {

	public static int recursive(int num){
		

		if(num == 0 || num == 1)
			return 1;
		else
			return (recursive(num-1) * num);

	}

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Wrong parameter input");
			return;
		}

		int number = Integer.parseInt(args[0]);

		int fact = recursive(number);
		System.out.println("Factorial value: " + fact);
	}
}