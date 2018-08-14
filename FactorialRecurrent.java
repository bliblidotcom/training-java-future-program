import java.util.*;

public class FactorialRecurrent
{
	public static int fac(int x){
		if (x == 1) return 1;
		return x * fac(x-1);
	}

	public static void main(String args[])
	{
		if (args.length != 1){
			System.out.println("Usage Factorial <numeric-number>");
			return;
		}
		int n = Integer.parseInt(args[0]);

		System.out.println("Sum = " + fac(n));
	}
}
