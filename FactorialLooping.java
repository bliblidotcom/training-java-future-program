public class FactorialLooping {
	public FactorialLooping(Integer number){
		Integer result = 1;

		for(int i = 1; i <= number; i++){
			result = result * i;
		}

		System.out.println(result);
	}

	public static void main(String[] args){
		try{
			new FactorialLooping(Integer.parseInt(args[0]));
		} catch(Exception e){
			System.out.println("Empty argument");
		}
	}
}