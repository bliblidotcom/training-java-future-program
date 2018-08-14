public class DayOfYear {
	public static void main(String[] args) {
		System.out.println("This is Nani DayOfYear:");

		if(args.length != 2){
			System.out.println("Wrong parameter input");
			return;
		}

		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);

		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 hari");
				break;
			case 2:
				if(year %4 == 0){
					System.out.println("29 hari");	
				} else{
					System.out.println("28 hari");	
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 hari");
				break;
			default:
				System.out.println("Not identified");
				break;
		}
	}
}