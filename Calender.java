import java.util.Scanner;

/**
 *
 * @author alfian
 */
public class Calender {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("input number range(1-12): ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch(input){
          case 1:
              System.out.println("Januari");
              break;
          case 2:
              System.out.println("Februari");
              break;
          case 3:
              System.out.println("Maret");
              break;
          case 4:
              System.out.println("April");
              break;
          case 5:
              System.out.println("Mei");
              break;
          case 6:
              System.out.println("Juni");
              break;
          case 7:
              System.out.println("Juli");
              break;
          case 8:
              System.out.println("Agustus");
              break;
          case 9:
              System.out.println("September");
              break;
          case 10:
              System.out.println("Oktober");
              break;
          case 11:
              System.out.println("Nopember");
              break;
          case 12:
              System.out.println("Desember");
              break;
          default:
              System.out.println("Please input a number in range 1 - 12");
        }
    }


}
