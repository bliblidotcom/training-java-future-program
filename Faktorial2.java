class Faktorial2{
    
    public static void main(String args[]) {
        if(args.length < 1){
            System.out.println("Usage Faktorial <number>");
            
            return;
        }

        int n = Integer.parseInt(args[0]);
        
        System.out.println(faktorial(n));
    }

    public static int faktorial(int n){
        if(n ==  0) return 1;
        else return n*faktorial(n-1);
    }

}