import java.util.Scanner;

public class Faktorial {
	public static void main(String[] args){

		int n = Integer.parseInt(args[0]);

		int fak = 1;
		//Scanner in = new Scanner(System.in);
		
		for (int i=2; i<=n; i++){
			fak*=i;
		}

		System.out.println(fak);
	}
}