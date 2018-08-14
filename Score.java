// Samuel Alferdo Astrada Napitupulu
// FUTURE3
public class Score{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: java Score <score>");
		}
		
		int score = Integer.parseInt(args[0]);
		
		if(score > 80){
			System.out.println("A");
		}else if(score > 60){
			System.out.println("B");
		}else if(score > 40){
			System.out.println("C");
		}else if(score > 20){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
}