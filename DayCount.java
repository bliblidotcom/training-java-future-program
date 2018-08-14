public class DayCount{
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Usage: dayCount <monthNum yearNum>");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        int days = 0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:                                                                                                                              
            case 11:
                days = 30;
                break;                          
            case 2:
                switch(year%4){
                    case 0:
                        days = 29;
                        break;
                    default:
                        days = 28;
                        break;
                }
                break;
            default:
                System.out.println("Tanggal Tidak Valid");
                break;  
        }
        System.out.println("Jumlah hari adalah " + days + " hari");
    }
}