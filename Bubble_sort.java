// Samuel Alferdo Astrada Napitupulu
// FUTURE3
public class Bubble_sort{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("Usage: java Faktorial <fak>");
		}	
		
		int n = args.length;
		
		int[] arr;
		arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i] + " ");
		}
	}
}