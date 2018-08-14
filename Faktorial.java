import java.util.Scanner;

public class Faktorial{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("masukan nilai X :");
        Integer x = sc.nextInt();

        if ( x == 0 ) {
            System.out.println(1);
        } else {
            Integer total = 1;
            for (int i=x;i >=1;i--){
                total *= i;
            }
            System.out.println(total);
        }
    }
}