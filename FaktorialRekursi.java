public class FaktorialRekursi{
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: java FaktorialRekursi <number>");
            return;
        }

        int number = Integer.parseInt(args[0]);

        FaktorialRekursi factorial = new FaktorialRekursi();
        System.out.println("Faktorial dengan rekursi: " + factorial.calc(number));
    }

    public long calc(long number){
        if(number == 0){
            return 1;
        }else{
            return number * calc(number-1);
        }
    }
}