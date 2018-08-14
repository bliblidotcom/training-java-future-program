public class Factorial{
	public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: Factorial <number>");
            return;
        }

        int total = 1;
        int fact = Integer.parseInt(args[0]);
        for(int i=1; i<=fact; i++){
        	if(fact == 0){
        		total = 1;
        	}
        	else{
        		total*= i;
        	}
        }
        System.out.println("Jumlah factorial adalah: " + total);
	}
}