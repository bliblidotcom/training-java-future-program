public class Faktorial{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: Faktorial <number>");
			return;
		}
		long f=1;
		int angka=0;
		angka= Integer.parseInt(args[0]);
		
		for(int i=1; i<=angka; i++){
			f *=i;			
		}
		System.out.println("Faktorial dari "+angka+" adalah "+f);
	}
}