public class BubbleSort{

    public static  void main (String [] args){
        
        Integer [] tabInt = new Integer[args.length];
        
        for (int i = 0; i < args.length; i++ ){
            tabInt[i] = Integer.parseInt(args[i]);
        }

        int len = tabInt.length;
        int temp;

        for (int i=0; i < len-1 ; i++){
            for (int j= len-1 ; j>0 ; j--){
                if (tabInt[j] < tabInt[j-1]){
                    temp = tabInt[j];
                    tabInt [j] = tabInt[j-1];
                    tabInt [j-1] = temp;
                }
            }
        }
        
        for (int i=0;i< len ; i++){
            System.out.printf(tabInt[i]+" ");
        }
        System.out.println();
    }


}