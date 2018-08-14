public class JumlahHari {
 public static void main(String[] args) {

 	if(args.length<2){
 		System.out.println("Usage: Calender<MonthNumber Year>");
 	}

 	int bulan= Integer.parseInt(args[0]);
 	int tahun= Integer.parseInt(args[1]);
 	int hari=1;

 	switch(bulan){
 		case 1:
			hari=31;		
 			break;
  		case 2:
  			{
  				if(tahun%4==0){
					hari=29; 		
  				}
  				else
  				{
  					hari=28;	
  				}
  			}
 			break;
  		case 3:
			hari=31; 		
 			break;
 		case 4:
 			hari=30;
 			break;
 		case 5:
 			hari=31;
 			break;
 		case 6:
 			hari=30;
 			break;
 		case 7:
 			hari=31;
 			break;
 		case 8:
 			hari=31;
 			break;
 		case 9:
 			hari=30;
 			break;
 		case 10:
 			hari=31;
 			break;
 		case 11:
 			hari=30;
 			break;
 		case 12:
 			hari=31;
 			break;
 	}

 	System.out.println("Jumlah hari dalam bulan tersebut adalah " + hari);

}
}

