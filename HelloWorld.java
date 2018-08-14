//import javax.swing.*;

public class HelloWorld{
	public static void main(String[] args){
		//System.out.println("Hello World!");
		if(args.length != 1){
			System.out.println("Usage: LetterScore <numeric> ");
			return;
		}
		
		int x= Integer.parseInt(args[0]);
		
		
		if(x >0 && x<=20){
			System.out.println("Score = E");
		}else if(x >20 && x<=40){
			System.out.println("Score = D");
		}else if(x >40 && x<=60){
			System.out.println("Score = C");
		}else if(x >60 && x<=80){
			System.out.println("Score = B");
		}else if(x >80 && x<=100){
			System.out.println("Score = A");
		}else{
			System.out.println("Maaf, Anda hanya bisa memasukkan angka 1-100!");
		}
	}
}