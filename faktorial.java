public class faktorial{
	public static void main(String[] args){
		if(args.length!=1){
			System.err.println("Usage: faktorial <angka>");
			return;
		}	
		int angka= Integer.parseInt(args[0]);
		int faktorial=1;
		for(int i =angka ; i>=1 ; i--){
			System.out.print(i+ " "+"\n");
			 faktorial = faktorial * i;
		}
		
		System.out.println(angka+"! = "+faktorial);
	
		
		
	}
}