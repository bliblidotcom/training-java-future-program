public class Rekursif{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: Rekursif <number>");
			return;
		}
		int n= Integer.parseInt(args[0]);
		System.out.println(rek(n));
	}
	
	public static int rek(int n){
		if(n==0 || n==1){
			return 1;
		}else{
			return n* rek(n-1);
		}
	}
}