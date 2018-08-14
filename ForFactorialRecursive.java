public class ForFactorialRecursive {
	public static void main (String[] args){
		if (args.length != 1) {
			System.err.println("ForFactorial <number>");
			return;
		}

		int number = Integer.parseInt(args[0]);
		ForFactorialRecursive hello = new ForFactorialRecursive();
		int ans = hello.factorial(number);
		System.out.println("Factorial Recursive: " + ans);
	}

	/*cara memanggil fungsi dalam main:
	https://www.homeandlearn.co.uk/java/java_method_calling.html
		1. function dibuat static
		2. memanggil di main dengan "new HelloWorld().factorial"
	*/

	public int factorial (int n) {
		if (n >= 1) {
			return (n * factorial(n-1));
		}
		else {
			return 1;
		}
	}
}