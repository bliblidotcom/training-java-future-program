public class BlnTahun{
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Usage: MonthFromNumber <month>");
			return;
		}
		int bln= Integer.parseInt(args[0]);
		int thn= Integer.parseInt(args[1]);
		int hri=0;
		
		switch(bln){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				hri=31; break;
			case 2: hri=((thn%4==0) && !(thn%100==0) || (thn%400==0)) ? 29 : 28; break;			
			case 4: 
			case 6:
			case 9:
			case 11:
				hri=30; break;
			default: System.out.println("Maaf Anda hanya bisa memasukkan bulan dari 1-12!"); break;
		}
		if(hri==31) System.out.println("Hari=31");
		else if(hri==30) System.out.println("Hari=30");
		else if(hri==29) System.out.println("Hari=29");
		else if(hri==28) System.out.println("Hari=28");
	}
}