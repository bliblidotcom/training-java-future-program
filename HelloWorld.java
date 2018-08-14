import java.util.Scanner;

public class HelloWorld{

    public static void main(String [] args){
        Integer value = new Integer(0);
        // System.out.println(args.length);
        if (args.length < 1){
            Scanner sc = new Scanner(System.in);
            System.out.printf("masukan nilai : ");
            value = sc.nextInt();
        } else {
            value = Integer.parseInt(args[0]);
        }
        if (value > 80) {
            System.out.println("A");
        } else if (value > 60){
            System.out.println("B");
        } else if (value > 40){
            System.out.println("C");
        } else if (value > 20){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

}