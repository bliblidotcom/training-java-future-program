public class TotalDays {
	public static void main(String[] args){
		
	if(args.length!=2){
		System.out.println("Input bulan dan tahun!");
	}
		
	int bulan= Integer.parseInt(args[0]);
	int tahun= Integer.parseInt(args[1]);
	
	switch (bulan) {
		case 1: case 3: case 5: case 7: case 8 : case 10 : case 12: System.out.println("punya 31 hari!"); break;
		case 4: case 6: case 9: case 11 : System.out.println("punya 30 hari!"); break;	
		case 2 :
			if(tahun%4==0 && tahun%100!=0 || tahun%400==0){
				System.out.println("punya 29 hari!");
			}else{
				System.out.println("punya 28 hari!");
			}	
	}
		
	switch (bulan) {
		case 1 :System.out.println("Bulan Januari punya 30 hari!");
		break;
		case 2 :
			if(tahun%4==0 && tahun%100!=0 || tahun%400==0){
				System.out.println("Bulan Februari punya 29 hari!");
			}else{
				System.out.println("Bulan Februari punya 28 hari!");
			}
		break;
		case 3 :System.out.println("Bulan Maret punya 31 hari!");
		break;
		case 4 :System.out.println("Bulan April punya 30 hari!");
		break;
		case 5 :System.out.println("Bulan Mei punya 31 hari !");
		break;
		case 6 :System.out.println("Bulan Juni punya 30 hari!");
		break;	
		case 7 :System.out.println("Bulan Juli punya 31 hari!");
		break;
		case 8 :System.out.println("Bulan Agustus punya 31 hari!");
		break;
		case 9 :System.out.println("Bulan September punya 30 hari!");
		break;
		case 10 :System.out.println("Bulan Oktober punya 31 hari!");
		break;	
		case 11 :System.out.println("Bulan November punya 30 hari!");
		break;
		case 12 :System.out.println("Bulan Desember punya 31 hari!");
		break;	
		default:System.out.println("Input Bulan dan hari!");
		break;
	}
  }
}
//
//1-20 e
//21-40 d
//41-60 c
//61-80 b
//81-100 a 