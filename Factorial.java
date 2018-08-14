public class Factorial {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int counter = 1;

        for (int i=2;i<=num;i++){
            counter*=i;
        }

        System.out.println(counter);

    }
}