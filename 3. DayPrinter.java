public class DayPrinter {
	public DayPrinter(Integer year, Integer month){
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
				break;
			case 2:
				if(year % 4 == 0){
					System.out.println("29");
				} else {
					System.out.println("28");
				}
				break;
			default:
				System.out.println("Invalid input!");
		}
	}

	public static void main(String[] args){
		try{
			new DayPrinter(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch (Exception e){
			System.out.println("Empty argument!");
		}
	}
}