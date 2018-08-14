public class Month {
	public static void main(String[] args){
		
	if(args.length!=2){
		System.out.println("Input bulan dan tahun!");
	}
		
	int bulan= Integer.parseInt(args[0]);
	int tahun= Integer.parseInt(args[1]);
	switch (bulan) {
		case 1 :System.out.println("Bulan Januari!");
		break;
		case 2 :
			if(tahun%4==0 && tahun%100!=0 || year%400==0){
				System.out.println("Bulan Februari punya 29 hari!");
			}else{
				System.out.println("Bulan Februari punya 28 hari!");
			}
		break;
		case 3 :System.out.println("Bulan Maret!");
		break;
		case 4 :System.out.println("Bulan April!");
		break;
		case 5 :System.out.println("Bulan Mei!");
		break;
		case 6 :System.out.println("Bulan Juni!");
		break;	
		case 7 :System.out.println("Bulan Juli!");
		break;
		case 8 :System.out.println("Bulan Agustus!");
		break;
		case 9 :System.out.println("Bulan September!");
		break;
		case 10 :System.out.println("Bulan Oktober!");
		break;	
		case 11 :System.out.println("Bulan November!");
		break;
		case 12 :System.out.println("Bulan Desember!");
		break;	
		default:System.out.println("Input Bulan!");
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