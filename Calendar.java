public class Calendar{
	public static void main(String[] args){
		if(args.length != 1){
            System.out.println("Usage: Calendar <MonthNumber>");
            return;
		}

		int month = Integer.parseInt(args[0]);
		switch(month){
			case 1:
				System.out.println("Bulan Januari");
				break;
			case 2:
				System.out.println("Bulan Februari");
				break;
			case 3:
				System.out.println("Bulan Maret");
				break;
			case 4:
				System.out.println("Bulan April");
				break;
			case 5:
				System.out.println("Bulan Mei");
				break;
			case 6:
				System.out.println("Bulan Juni");
				break;
			case 7:
				System.out.println("Bulan Juli");
				break;
			case 8:
				System.out.println("Bulan Agustus");
				break;
			case 9:
				System.out.println("Bulan September");
				break;
			case 10:
				System.out.println("Bulan Oktober");
				break;																																
			case 11:
				System.out.println("Bulan November");
				break;
			case 12:
				System.out.println("Bulan Desember");
				break;							
			default:
				System.out.println("Bulan Tidak Valid");
				break;	
		}
	}
}