import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
            scoring();
        
    }

    public static void scoring()
    {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        switch(month)
        {
            case 1: 
                System.out.println("This month days is 31");
                break;
            case 2:
            String announcedayskabisat = "this month days is 29";
            if(year%400 == 0)
            {
                System.out.println(announcedayskabisat);
            }
            else
            {
                if(year%4 == 0)
                {
                    System.out.println(announcedayskabisat);
                }
                else
                     System.out.println("This month days is 28");
            }
                break;
            case 3:
                System.out.println("This month days is 31");
                break;
            case 4:
                System.out.println("This month days is 30");
                break;
            case 5:
                System.out.println("This month days is 31");
                break;
            case 6:
                System.out.println("This month days is 30");
                break;
            case 7:
                System.out.println("This month days is 31");
                break;
            case 8:
                System.out.println("This month days is 30");
                break;
            case 9:
                System.out.println("This month days is 31");
                break;
            case 10:
                System.out.println("This month days is 31");
                break;
            case 11:
                System.out.println("This month days is 31");
                break;
            case 12:
                System.out.println("This month days is 31"); 
                break;               
        }
    }
}
