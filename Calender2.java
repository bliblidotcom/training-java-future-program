/* 	Nama File : Calender2.java
	Nico G. S. Panjaitan
*/

public class Calender2 {
	public static void main (String[] args) {
	
		if (args.length != 2) {
			System.out.println ("Usage:Month form number <month>");
			return;
		}
	
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt (args[1]);
		
		
		switch (month) {
			case 1:
			case 3:
			case 5: 
			case 7:
			case 8: 
			case 10:
			case 12:
				System.out.println (31);
				break;
			
			case 2:
				if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0 ))
				{
					System.out.println (29);
				}
				else 
					System.out.println (28);
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println (30);
				break;
			
			default :
				System.out.println("Masukkan angka pilihan <bulan> 1-12");
		
		}
	}
		
}