public class HelloWorld{
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		// int input = Integer.parseInt(System.console().readLine());
		if(input>=1&&input<=20){
			System.out.println("Nilai E");
		}
		else if(input>=21&&input<=40){
			System.out.println("Nilai D");
		}
		else if(input>=41&&input<=60){
			System.out.println("Nilai C");
		}
		else if(input>=61&&input<=80){
			System.out.println("Nilai B");
		}
		else if(input>=81&&input<=10){
			System.out.println("Nilai A");
		}
		else{
			System.out.println("Input angka 1-100");
		}
	}
}