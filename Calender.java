import java.util.Scanner;

public class Calender{

    public static void main(String [] args){
        Integer month = new Integer(0);
        Integer year = new Integer(0);
        // System.out.println(args.length);
        Boolean isKabisat = new Boolean(true);
        if (args.length < 1){
            Scanner sc = new Scanner(System.in);
            System.out.printf("masukan bulan (angka) : ");
            month = sc.nextInt();
            System.out.printf("masukan tahun :");
            year = sc.nextInt();
        } else {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[0]);
        }
        
        isKabisat = (((year % 4 == 0) &&  !(year % 100 == 0 ) ) || (year % 400 == 0));

        switch (month) {
            case 1:
                System.out.println("Januari " + year + " adalah 31 hari"); break;
            case 2:
                if(isKabisat){
                    System.out.println("Februari " + year + " adalah 29 hari");
                } else {
                    System.out.println("Februari " + year + " adalah 28 hari");
                }
                break;
            case 3:
                System.out.println("Maret " + year + " adalah 31 hari"); break;
            case 4:
                System.out.println("April " + year + " adalah 30 hari"); break;
            case 5:
                System.out.println("Mei " + year + " adalah 31 hari"); break;
            case 6:
                System.out.println("Juni " + year + " adalah 30 hari"); break;
            case 7:
                System.out.println("Juli " + year + " adalah 31 hari"); break;
            case 8:
                System.out.println("Agustus " + year + " adalah 31 hari"); break;
            case 9:
                System.out.println("September " + year + " adalah 30 hari"); break;
            case 10:
                System.out.println("Oktober " + year + " adalah 31 hari"); break;
            case 11:
                System.out.println("November " + year + " adalah 30 hari"); break;
            case 12:
                System.out.println("Desember " + year + " adalah 31 hari"); break;
            default:
                System.out.println("Bulan yang dimasukan tidak valid");
                break;
        }
    }

}