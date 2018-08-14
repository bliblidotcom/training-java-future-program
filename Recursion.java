public class Recursion{
	public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: Recursion <number>");
        }
            int fact = Integer.parseInt(args[0]);
            int jawab = 1;
            jawab = count(fact);
            System.out.println("Total perhiitungan adalah: "+jawab);
	}

    public static int count(int  fact){
        if(fact==1)return 1;
        int total = fact*count(fact-1);
        return total;
    }

}
