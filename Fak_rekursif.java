// Samuel Alferdo Astrada Napitupulu
// FUTURE3
public class Bubble_sort{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("Usage: java Faktorial <fak>");
		}	
		
		int n = Integer.parseInt(args.length);
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=i;j<n-1;j++){
				if(args.length[j]<args.length[j+1]){
					temp=args.length[j];
					args.length[j]=args.length[j+1];
					args.length[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(args[i] + " ");
		}
	}
}