public class FacRecursive{
	public static void main(String[] args){
		int number=Integer.parseInt(args[0]);
		System.out.println(Recursive(number));
	}
	public static int Recursive(int n){		
		if(n>1) return n*(Recursive(n-1));		
		else return n;
	}
}