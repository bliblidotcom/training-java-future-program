
public class BubbleSort {

	public static void main(String[] args) {
		int panjang = args.length;
		int[] arr = new int[panjang];
		for(int i=0;i<panjang;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<panjang;i++) {
			for(int j=0;j<panjang-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tamp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tamp;
				}
			}
		}
		for(int i=0;i<panjang;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
