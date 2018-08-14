public class ScoreCalculator {
	public ScoreCalculator(Integer score){

	}

	public static void main(String[] args){
		try{
			new ScoreCalculator(Integer.parseInt(args[0]));
		} catch(Exception e){
			System.out.println("Empty argument!");
		}
	}
}