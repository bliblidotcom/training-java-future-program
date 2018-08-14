import java.util.*;

public class Factorial
{
	public static void main(String args[])
	{
		if (args.length != 1){
			System.out.println("Usage Factorial <numeric-number>");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		
		for(int i=2;i<=n;i++){
			sum *= i;
		}
		System.out.println("Sum = " + sum);
	}
}
