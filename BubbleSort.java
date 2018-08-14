public class BubbleSort{
	public static void main(String[] args){
		int length = args.length;
		int[] arrNum = new int[length];
		
		for(int i=0; i<length; i++){
			arrNum[i] = Integer.parseInt(args[i]);
		}
		
		sort(arrNum, length);
	}
	
	public static void sort(int arrNum[], int length){
		for(int a=0; a<length; a++){
			for(int b=0; b<length-1; b++){
				if(arrNum[b]>arrNum[b+1]){
					int temp = arrNum[b];
					arrNum[b] = arrNum[b+1];
					arrNum[b+1] = temp;
				}
			}
			
		}
		for(int a=0; a<length; a++){
			System.out.print(arrNum[a]+ " ");
		}
	}
}