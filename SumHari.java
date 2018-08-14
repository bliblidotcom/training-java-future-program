public class SumHari {
    private static Integer jumlahHari (Integer tahun, Integer bulan) {
        if (bulan > 12 || bulan < 0) {
            return -1;
        }
        switch (bulan) {
            case 1:
                return 31;
            case 2:
                if (tahun % 4 == 0) {
                    return 29;
                }
                else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println(jumlahHari(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }
        else {
            System.out.println("Wrong input!");
        }
    }
}