import java.util.Arrays;

public class BubbleSortAsc{
	public static void main(String[] args) {
		int[] angka = new int[args.length];

		for(int i=0;i<args.length;i++){
			angka[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++) {
			for(int j=0;j<args.length-1;j++) { 
				if(angka[j] > angka[j+1]){
					//swap 2 variabel
					angka[j] = angka[j]+angka[j+1];
					angka[j+1] = angka[j]-angka[j+1];
					angka[j] = angka[j]-angka[j+1];
					
					//swap 3 variabel
					/* int temp = angka[j];
					angka[j] = angka[j+1];
					angka[j+1] = temp;*/
				}
			}
		}
		System.out.println("Hasil : "+Arrays.toString(angka));
	}
}