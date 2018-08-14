/* 	Nama File : BubbleSort.java
	Nico G. S. Panjaitan
*/

public class BubbleSort {
	
	public static void main (String[] args) {

		if (args.length < 1) {
			System.err.println ("Usage:Input form <al1, al2, ...,>");
			return;
		}
		
		int list[] = new int [args.length];
		
		for (int i = 0; i < args.length; i++){
			list[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<list.length; i++){
			for(int j=i + 1; j<list.length; j++){
				if(list[i] > list[j]){
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		System.out.print("Hasil setelah Bubble Sort: ");
		for(int i=0; i<list.length; i++){
			System.out.print(list[i] + " " );
		}	
	}
}