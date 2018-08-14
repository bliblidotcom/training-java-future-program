/* 	Nama File : FactorRek.java
	Nico G. S. Panjaitan
*/

public class FactorRek {
	public static int factorial (int angka) {
		if (angka == 0) 
			return 1;
		else
			return (angka * factorial(angka-1));
	}
	
	public static void main (String[] args) {
		if (args.length != 1) {
			System.out.println ("Usage:Input form <number>");
			return;
		}
		
		int angka = Integer.parseInt (args[0]);
		
		System.out.println("Factorial dari " + angka + " adalah " + factorial(angka));
    }
}