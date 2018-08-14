package blibli;

import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numb=input.nextInt();
        int numtemp=1;
        for (int i = 1; i <= numb; i++) {
            numtemp=numtemp*(i);
            System.out.println(numtemp);
        }
    }
    
}
