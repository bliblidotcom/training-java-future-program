class Calendar{
    public static void main(String args[]){
        if(args.length < 1){
            System.out.println("Usage Calendar <month>");
            
            return;
        }

        int month = Integer.parseInt(args[0]);
        String res = "";

        switch(month){
            case 1:
                res = "Januari";

                break;
            case 2:
                res = "Febuari";

                break;
            case 3:
                res = "Maret";

                break;
            case 4:
                res = "April";

                break;
            case 5:
                res = "Mei";

                break;
            case 6:
                res = "Juni";

                break;
            case 7:
                res = "Juli";

                break;
            case 8:
                res = "Agustus";

                break;
            case 9:
                res = "September";

                break;
            case 10:
                res = "Oktober";

                break;
            case 11:
                res = "November";

                break;
            case 12:
                res = "Desember";

                break;                
        }
        
        System.out.println(res);
    }
}