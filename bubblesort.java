public class bubblesort{
	public static void main(String[] args){
		if(args.length<1){
			System.err.println("Usage: bubblesort < isi array >");
			return ;
		}
		
		int[] arrayInteger = new int[args.length];
		
		System.out.println("Before Sorting: ");
		
		//print all before
		for(int i=0; i < arrayInteger.length; i++){
			arrayInteger[i]=Integer.parseInt(args[i]);
			System.out.print(arrayInteger[i] + " ");
			
		}
		
		//sorting function
		int n=args.length ;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arrayInteger[j-1]>arrayInteger[j]){
					//swap elements
					temp=arrayInteger[j-1];
					arrayInteger[j-1]=arrayInteger[j];
					arrayInteger[j]= temp;
					}
				}
			}
		
		
		System.out.println("\n\nAfter Sorting: ");
		//print all after 
		for(int i=0; i<arrayInteger.length; i++){
			System.out.print(arrayInteger[i] + " ");
		}		
		
		
	}
}
