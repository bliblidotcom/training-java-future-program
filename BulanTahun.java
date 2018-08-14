public class BulanTahun {
    public static void main(String[] args) {
        int bulan = Integer.parseInt(args[0]);
        int tahun = Integer.parseInt(args[1]);

        switch (bulan) {
            case 1 :
                System.out.println(31);
                break;
            case 2 :
                if (tahun % 4 == 0 && (tahun % 400 == 0 || tahun % 100 != 0)) {
                    System.out.println(29);
                    break;
                }
                else {
                    System.out.println(28);
                    break;
                }
            case 3 :
                System.out.println(31);
                break;
            case 4 :
                System.out.println(30);
                break;
            case 5 :
                System.out.println(31);
                break;
            case 6 :
                System.out.println(30);
                break;
            case 7 :
                System.out.println(31);
                break;
            case 8 :
                System.out.println(31);
                break;
            case 9 :
                System.out.println(30);
                break;
            case 10 :
                System.out.println(31);
                break;
            case 11 :
                System.out.println(30);
                break;
            case 12 :
                System.out.println(31);
                break;
            default :
                System.out.println("Bulan Invalid");
                break;
        }
    }
}