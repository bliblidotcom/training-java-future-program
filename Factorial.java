/* 	Nama File : Factorial.java
	Nico G. S. Panjaitan
*/

public class Factorial {
	public static void main (String[] args) {
		if (args.length != 1) {
			System.out.println ("Usage: factorial form <number>");
			return;
		}
		int fak = 1;
		int angka = Integer.parseInt (args[0]);
		
		for(int i=1; i<=angka; i++){
            fak = fak * i;
        }
		
        System.out.println("Faktorialnya "+angka+" adalah "+fak);
    }
}