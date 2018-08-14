public class DayPrinter {
	public static void main(String[] args){
		try{
			new DayPrinter(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch (Exception e){
			System.out.println("Empty argument!");
		}
	}
}