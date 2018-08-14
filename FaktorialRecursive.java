import java.util.Scanner;

public class FaktorialRecursive {

	public static int fac(int x){

		if (x==1) {
			return x;
		} else {
			return x*fac(x-1);
		}
	}


	public static void main(String[] args){

		int n = Integer.parseInt(args[0]);

		int fak = fac(n);

		System.out.println(fak);
	}
}