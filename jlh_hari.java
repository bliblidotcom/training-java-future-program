public class jlh_hari{
	public static void main(String[] args){
		if(args.length!=2){
			System.err.println("Usage: jlh_hari <bulan> <tahun>");
			return;
		}	
		int bulan= Integer.parseInt(args[0]);
		int tahun = Integer.parseInt(args[1]);
		
		switch(bulan){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
			break;
			
			case 2:
				if(tahun%100==0 || tahun%100!=0 && tahun%400 == 0){
					System.out.println("29");
				}
				else{
					System.out.println("28");
				}
			break;
			default:
				System.out.println("Masukkan sesuai instruksi");
		}
		
	}
}