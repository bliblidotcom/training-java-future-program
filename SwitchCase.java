public class SwitchCase {
	public static void main(String[] args) {
		/*if(args.length!=1){
		System.err.println("Usage:MonthFromNumber <month>");return;
		}*/
		int year=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		boolean cek=false;

		cek=(((year%4==0) && !(year%100==0)) || (year%400==0))?true:false;
		
		System.out.print("Jumlah hari pd thn "+year+" Bulan "+month+" adalah ");
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("31");
				break;
			case 2:
				if(cek){
					System.out.print("29");
				}
				else {System.out.print("28");
				}	
				break;
			case 4:		
			case 6:
			case 9:
			case 11:
				System.out.print("30");
				break;
		}
		System.out.print(" Hari ");
		
	}
}
