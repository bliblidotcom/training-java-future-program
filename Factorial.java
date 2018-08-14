public class Factorial {
	public static void main(String[] args){
		
	if(args.length!=1){
		System.out.println("Input angka!");
	}
		
	int angka= Integer.parseInt(args[0]);
	int i,f=1;
		
	 for (i=1; i<=angka ; i++){
		 f=f*i;
	 }
	
		System.out.println(f);
  }
}
//
//1-20 e
//21-40 d
//41-60 c
//61-80 b
//81-100 a 