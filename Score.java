/* 	Nama File : Score.java
	Nico G. S. Panjaitan
*/

public class Score {
	public static void main (String[] args) {
			
		if (args.length != 1) {
			System.out.println ("Usage:Score form-number <month>");
			return;
		}
		
		int score = Integer.parseInt (args[0]);
		
		if( score < 30)  {
			System.out.println("E");
		}
		else if( score < 40) {
			System.out.println("D");
		}
		else if( score < 50) {
			System.out.println("C");
		}
		else if( score < 60) {
			System.out.println("B");
		}
		else if( score < 70) {
			System.out.println("AB");
		}
		else {
			System.out.println("A");
		}
	}
}