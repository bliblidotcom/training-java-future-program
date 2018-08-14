package blibli;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Panjang array : ");
        int panjang=in.nextInt();
        int[] array=new int[panjang];
        for (int i = 0; i <array.length; i++) {
            System.out.print("Nilai ke-"+i+" : ");
            array[i]=in.nextInt();
        }
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
