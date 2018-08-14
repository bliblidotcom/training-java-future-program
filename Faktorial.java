
public class Faktorial {

	public static void main(String[] args) {
		int angka = Integer.parseInt(args[0]);	
		if(args.length != 1) {
			System.out.println("Input harus 1 angka");
			return;
		}
		int hasil=angka;
		for(int i=angka-1;i>1;i--) {
			hasil*=i;
		}
		if(hasil==0) hasil=1;
		System.out.println("Hasil faktorial dari " + angka + " adalah " + hasil);
	}

}
