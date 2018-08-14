public class Arraysort {
	public static void main(String[] args) {
		int[] array = new int[args.length];
		for(int i=0;i<args.length;i++){
			array[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
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

