import java.util.*;

public class Calendar_2
{
	public static void main(String args[])
	{
		if (args.length != 2){
			System.out.println("Usage Calendar <numeric-year> <numeric-month>");
			return;
		}

		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = 0;
		boolean leapy = false;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			leapy = true;
		}

		switch (month){
			case 2:
				day = leapy ? 29 : 28; break;
			case 1:	
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31; break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30; break;
			default:
				System.out.println("Range Month are 1 - 12!");

		}
		System.out.println("Day = " + day);
	}
}