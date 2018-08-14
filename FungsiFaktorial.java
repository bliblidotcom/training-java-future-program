public class FungsiFaktorial {
    public static void main(String[] args) {

        int nilai = Integer.parseInt(args[0]);
        int hasil;
        hasil = new FungsiFaktorial().faktorial(nilai);
        System.out.println(hasil);
    }

    public int faktorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * faktorial(n - 1);
        }
    }
}