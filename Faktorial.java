public class Faktorial{
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		int cpy = input;
		for (int i=1;i<cpy;i++){
			input = input*i;
		}
		System.out.println(input);
	}
}