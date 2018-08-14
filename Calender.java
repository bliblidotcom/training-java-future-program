public class Calender {
	public static void main(String[] args) {
		System.out.println("This is a Nani Calender:");
		
		if(args.length != 1){
			System.out.println("Wrong parameter input");
			return;
		}

		int month = Integer.parseInt(args[0]);;

		switch(month){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Februari");
				break;
			case 3:
				System.out.println("January");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("Mei");
				break;
			case 6:
				System.out.println("Juni");
				break;
			case 7:
				System.out.println("juli");
				break;
			case 8:
				System.out.println("Agustus");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("Oktober");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("Desember");
				break;
			default:
				System.out.println("Not identified");
				break;
		}
	}
}