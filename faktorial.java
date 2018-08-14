public class faktorial {
	public static void main(String[] args) {
		if(args.length!=1){
		System.err.println("Usage:MonthFromNumber <month>");return;
		}
		int n=Integer.parseInt(args[0]);
		if(n==0||n==1){
			System.out.println(0);
		}
		else{
			int c=1;
			for(int i=n;i>=1;i--){
				c*=i;
			}
			System.out.println(c);
		}

	}

	
}
