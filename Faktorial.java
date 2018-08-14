public class Faktorial {
    public static void main(String[] args) {

        int nilai = Integer.parseInt(args[0]);

        int jumlah = 1;

        if (nilai == 0 && nilai == 1) {
            System.out.println(1);
        }
        else {
            for (int i = nilai; i > 0; i--) {
                jumlah *= i;
            }
            System.out.println(jumlah);
        }
    }
}