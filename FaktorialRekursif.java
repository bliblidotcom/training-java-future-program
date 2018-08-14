
public class FaktorialRekursif {

	public static void main(String[] args) {
		int angka = Integer.parseInt(args[0]);	
		if(args.length != 1) {
			System.out.println("Input harus 1 angka");
			return;
		}
		int hasil=angka;
		hasil = new FaktorialRekursif().hitungFaktorial(hasil);
		System.out.println("Hasil faktorial dari " + angka + " adalah " + hasil);

	}
	
	public int hitungFaktorial(int hasil) {
		if(hasil==0) return 1;
		else
			return hasil*hitungFaktorial(hasil-1);
	}

}
