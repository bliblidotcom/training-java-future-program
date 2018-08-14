public class Score {
	public static void main(String[] args){
		System.out.println("Hello World !");
		
	//KALENDAR
	if(args.length!=1){
				System.out.println("Input angka!");
	}
		
	int score= Integer.parseInt(args[0]);
	if(score>80){
		System.out.println("Nilai A");
	}else if(score>60){
		System.out.println("Nilai B");
	}else if(score>40 ){
		System.out.println("Nilai C");
	}else if(score>20){
		System.out.println("Nilai D");
	}else{
		System.out.println("Nilai E");
	}

	}
	
}
//
//1-20 e
//21-40 d
//41-60 c
//61-80 b
//81-100 a 