public class fakrekursif{
	
	public static int faktorial(int n){
		if(n==1)
			return 1;
		else
			return (n * faktorial(n-1));
		
	}
	
	public static void main(String[] args)
	{
		int value = Integer.parseInt(args[0]);
		System.out.println(faktorial(value));
	}
}