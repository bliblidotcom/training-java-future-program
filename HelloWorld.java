

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int score = Integer.parseInt(args[0]);
		System.out.print("Grade = ");
		if(score>=80) {
			System.out.print("A");
		}
		else if(score>=60){
			System.out.print("B");
		}
		else if(score>=40){
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}
	}
}
