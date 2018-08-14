import java.util.Scanner;

public class Calender1{
    
    public static void main(String [] args){
        Integer month = new Integer(0);
        if (args.length < 1){
            Scanner sc = new Scanner(System.in);
            System.out.printf("masukan bulan (angka) : ");
            month = sc.nextInt();
        } else {
            month = Integer.parseInt(args[0]);
        }

        switch (month) {
            case 1:
                System.out.println("Januari "); break;
            case 2:
                System.out.println("Februari "); break;
            case 3:
                System.out.println("Maret "); break;
            case 4:
                System.out.println("April "); break;
            case 5:
                System.out.println("Mei "); break;
            case 6:
                System.out.println("Juni "); break;
            case 7:
                System.out.println("Juli "); break;
            case 8:
                System.out.println("Agustus "); break;
            case 9:
                System.out.println("September "); break;
            case 10:
                System.out.println("Oktober "); break;
            case 11:
                System.out.println("November "); break;
            case 12:
                System.out.println("Desember "); break;
            default:
                System.out.println("Bulan yang dimasukan tidak valid");
                break;
        }
    }

}