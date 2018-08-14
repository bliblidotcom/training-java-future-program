import java.util.*;

public class Calendar
{
	public static void main(String args[])
	{
		if (args.length != 1){
			System.out.println("Usage Calendar <numeric-month>");
			return;
		}
		int mnth = Integer.parseInt(args[0]);

		switch (mnth){
			case 1:
				System.out.println("Month = January"); break;
			case 2:
				System.out.println("Month = February"); break;
			case 3:
				System.out.println("Month = March"); break;
			case 4:
				System.out.println("Month = April"); break;
			case 5:
				System.out.println("Month = May"); break;
			case 6:
				System.out.println("Month = June"); break;
			case 7:
				System.out.println("Month = July"); break;
			case 8:
				System.out.println("Month = August"); break;
			case 9:
				System.out.println("Month = September"); break;
			case 10:
				System.out.println("Month = October"); break;
			case 11:
				System.out.println("Month = November"); break;
			case 12:
				System.out.println("Month = Desember"); break;
			default:
				System.out.println("Range Month are 1 - 12!");
		}
	}
}