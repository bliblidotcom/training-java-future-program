import java.util.Scanner;

public class BulanTahun {
	public static void main(String[] args){

		int bulan = Integer.parseInt(args[0]);
		int tahun = Integer.parseInt(args[1]);
		int hari = 0;

		//Scanner in = new Scanner(System.in);
		switch (bulan){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				hari = 31;
			break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				hari = 30;
			break;
			case 2 :
				if (((tahun%4==0)&&(tahun%100!=0))||tahun%400==0){
					hari = 29;
				} else {
					hari = 28;
				}
			break;
		}

		System.out.println(hari);
	}
}