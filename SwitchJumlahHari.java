public class SwitchJumlahHari {
	public static void main (String[] args){
		if (args.length != 2){
			System.err.println("SwitchJumlahHari <bulan> <tahun> dalam angka");
			return;
		}

		//jumlah hari dalam bulan (termasuk kabisat hanya kelipatan 4)
		int bulan = Integer.parseInt(args[0]);
		int tahun = Integer.parseInt(args[1]);
		int jumlahHari;
	
		// https://www.geeksforgeeks.org/switch-statement-in-java/

		switch (bulan){
			case 4:
			case 6:
			case 9:
			case 11:
				jumlahHari = 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				jumlahHari = 31;
				break;
			case 2:
			//https://en.wikipedia.org/wiki/Leap_year
				// if (tahun % 4 == 0) jumlahHari = 29;
				// else jumlahHari = 28;
				if ((tahun % 4 == 0) && !(tahun % 100 == 0) && (tahun % 400 == 0)) {
					jumlahHari = 29;	
				}
				else jumlahHari = 28;
				
				break;
			default :
				jumlahHari = 0;
		}		

		System.out.println("Terdapat " + jumlahHari + " hari");
	}
}