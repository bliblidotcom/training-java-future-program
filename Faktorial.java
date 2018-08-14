class Faktorial{

    public static void main(String args[]) {
        if(args.length < 1){
            System.out.println("Usage Faktorial <number>");
            
            return;
        }
        
        int res = 1;
        
        for(int i = 1; i <= Integer.parseInt(args[0]); i++){
            res *= i;
        }

        System.out.println(res);
    }
}