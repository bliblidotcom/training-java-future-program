import java.util.Scanner;

public class FaktorialRek{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("masukan nilai X :");
        Integer x = sc.nextInt();
        System.out.println(factorial(x));
    }

    public static Integer factorial (int value){
        if (value == 0) 
            return 1; 
        else
            return value*factorial(value-1);
    } 
}