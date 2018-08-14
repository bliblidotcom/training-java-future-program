public class switch2{
	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("----");
		}
		int tahun = Integer.parseInt(args[0]);
		int bulan = Integer.parseInt(args[1]);
		int day=0;
		switch(bulan){
			case 1 : day = 31;
					 break;
			case 2 : if(tahun%4 == 0)
					 	day = 29;
					 else
					 	day = 28;
					 break;
			case 3 : day = 31;
					 break;
			case 4 : day = 30;
					 break;
			case 5 : day = 31;
					 break;
			case 6 : day = 30;
					 break;
			case 7 : day = 31;
					 break;
			case 8 : day = 31;
					 break;
			case 9 : day = 30;
					 break;
			case 10 : day = 31;
					 break;
			case 11 : day = 30;
					 break;
			case 12 : day = 31;
					 break;
			default : System.out.println("Tidak Ada");
					  break;
		}
		System.out.println(day);
	}

}