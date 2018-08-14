public class FaktorialLoop{
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: java FaktorialLoop <number>");
            return;
        }

        long number = Integer.parseInt(args[0]);
        long total = 1;

        for(long i=number; i > 1; i--){
            total *= i;
        }
        
        System.out.println("Faktorial dengan for: " + total);
    }
}