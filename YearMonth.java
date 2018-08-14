public class YearMonth {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int totalDay = 0;
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            totalDay = 31;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            totalDay = 30;
            break;

            case 2:
                if (((year % 4 == 0)&&(year % 100 != 0))||(year%400==0)){
                    totalDay = 29;
                } else {
                    totalDay = 28;
                }
            break;
        }

        System.out.println(totalDay);

    }
}