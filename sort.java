public class ArraySort {
	public static void main(String[] args) {
		/*if(args.length!=1){
		System.err.println("Usage:MonthFromNumber <month>");return;
		}
		int n=Integer.parseInt(args[0]);*/
		int[] array={5,4,2,1,3};
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;i++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+ " ");
		}
	}
}