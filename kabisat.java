/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibli;

import java.util.Scanner;

/**
 *
 * @author Ghozi AW
 */
public class kabisat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bulan : ");
        int bulan=input.nextInt();
        System.out.print("Tahun : ");
        int tahun=input.nextInt();
        switch (bulan) {
            case 2:
                if ((tahun%4==0)&&(tahun%100!=0)) {
                    System.out.println("29");
                }else{
                    System.out.println("28");
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;                
            default:
                throw new AssertionError();
        }
    }
    
}
