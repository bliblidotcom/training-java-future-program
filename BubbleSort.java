public class BubbleSort {

    public static void main(String[] args) {
        int num[] = new int[args.length];

        for (int i=0;i<args.length;i++){
            num[i] = Integer.parseInt(args[i]);

        }

        int c;
        for (int i=0;i < (num.length - 1);i++){
            for (int j=i+1 ; j<(num.length);j++){
                if (num[j] < num[i]){
                    c = num[i];
                    num[i] = num[j];
                    num[j] = c;

                }

            }

        }

        for (int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }

    }

}