public class MonthNamePrinter {
	public MonthNamePrinter(Integer monthNumber){

	}

	public static void main(String[] args){
		try{
			new MonthNamePrinter(Integer.parseInt(args[0]));
		} catch(Exception e){
			System.out.println("Empty argument!");
		}
	}
}