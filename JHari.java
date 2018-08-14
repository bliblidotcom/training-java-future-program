public class JHari{


  private static boolean isKabisat(int tahun){
    if(tahun%400 == 0){return true;}
    else if(tahun%100 == 0){return false;}
    else if(tahun%4 == 0){return true;}

    return false;
  }

  public static void main(String[] args) {
    if(args.length != 2){
      System.out.println("Usage :");
      System.out.println("javac JHari <bulan> <tahun>");
      return;
    }
    int bulan = Integer.parseInt(args[0]);
    int tahun = Integer.parseInt(args[1]);

    if(bulan == 2){
      if(isKabisat(tahun)){
        System.out.println("29 hari");
      }
      else{
        System.out.println("28 hari");
      }
    }
    else if(bulan <= 12){
      switch(bulan){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          System.out.println("31 hari");
          break;
        default:
          System.out.println("30 hari");
      }
      // cara lain
      // if(bulan>7){
      //   bulan-=7;
      // }
      // if(bulan%2 == 1){
      //   System.out.println("31 hari");
      // }
      // else{
      //   System.out.println("30 hari");
      // }
    }
    else{
      System.out.println("tolong input bulan dalam range(1-12)");
    }

  }

}
