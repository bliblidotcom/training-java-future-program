
public class Kalender {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Harus 1 angka");
			return;
		}
		int month = Integer.parseInt(args[0]);
		String name = "";
		
		switch(month) {
			case 1 : name="Januari"; break;
			case 2 : name="Februari"; break;
			case 3 : name="Maret"; break;
			case 4 : name="April"; break;
			case 5 : name= "Mei"; break;
			case 6 : name="Juni"; break;
			case 7 : name="Juli"; break;
			case 8 : name="Agustus"; break;
			case 9 : name="September"; break;
			case 10 : name="Oktober"; break;
			case 11 : name="November"; break;
			case 12 : name="Desember"; break;
			default: name="Bulan hanya ada 1-12";
		}
		
		System.out.println(name);

	}

}
