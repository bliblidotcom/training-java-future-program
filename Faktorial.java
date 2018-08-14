// Samuel Alferdo Astrada Napitupulu
// FUTURE3
public class Faktorial{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: java Faktorial <fak>");
		}
		int n = Integer.parseInt(args[0]);
		int fak=1;
		for(int i=1;i<=n;i++){
			fak *= i;
		}
		System.out.println(fak);
	}
}