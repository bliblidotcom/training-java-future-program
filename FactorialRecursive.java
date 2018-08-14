public class FactorialRecursive {
	private Integer recursive(Integer number){
		if(number > 0){
			return number * recursive(number - 1);
		}
		return 1;
	}

	public FactorialRecursive(Integer number){
		Integer result = recursive(number);

		System.out.println(result);
	}

	public static void main(String[] args){
		try{
			new FactorialRecursive(Integer.parseInt(args[0]));
		} catch (Exception e){
			System.out.println("Empty argument!");
		}
	}
}