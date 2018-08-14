class Calendar2{
    public static void main(String args[]){
        if(args.length < 1){
            System.out.println("Usage Calendar <year> <month>");
            
            return;
        }

        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[0]);
        int day = 0;

        switch(month){
            case 1:
                day = 31;

                break;
            case 2:
                if((year % 4 == 0 && (year % 100 != 0)) || year % 400 == 0){
                    day = 29;
                }else{
                    day = 28;
                }

                break;
            case 3:
                day = 31;

                break;
            case 4:
                day = 30;

                break;
            case 5:
                day = 31;   

                break;
            case 6:
                day = 30;

                break;
            case 7:
                day = 31;

                break;
            case 8:
                day = 31;

                break;
            case 9:
                day = 30;

                break;
            case 10:
                day = 31;

                break;
            case 11:
                day = 30;

                break;
            case 12:
                day = 31;

                break;                
        }
        
        System.out.println(day);
    }
}