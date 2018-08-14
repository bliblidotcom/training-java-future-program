public class FactorialRecursive {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        System.out.println(Factorial(num));

    }

    public static int Factorial(int a){
    	if (a == 1){
    		return a;
    	} else {
    		return a*Factorial(a-1);
    	}
    }
}