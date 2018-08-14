public class Factorial{
	public static void main(String[] args){
		int number=Integer.parseInt(args[0]);
		int result=1;
		for(int i=2;i<=number;i++){
			if(number==0){
				result=0;
				break;
			}
			result*=i;
		}
		System.out.println(result);
	}
}