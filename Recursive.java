public class Recursive {
 public static void main(String[] args) {

 	int input=Integer.parseInt(args[0]);
 	int jawaban=1;

 	jawaban=factorial(input);

 	System.out.println(jawaban);
}

public static int factorial(int n){
	if(n==1) return 1;
	int jawab=n*(factorial(n-1));

	return jawab;
}
}

