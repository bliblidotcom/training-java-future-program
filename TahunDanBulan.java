
public class TahunDanBulan {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Input harus 2 angka");
			System.out.println("Angka pertama adalah TAHUN");
			System.out.println("Angka kedua adalah BULAN");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = 0;
		
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				day=31; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : day=30; break;
			case 2 :
					day = ((year%4==0) && !(year%100==0) || (year%400==0)) ? 29 : 28;
					break;
			default: day=0; break;
		}
		if(day!=0) {
			System.out.println("Jumlah hari di tahun "+ year + " bulan " + month +" adalah "+ day);
		}
		else {
			System.out.println("Input salah");
		}
	}

}
