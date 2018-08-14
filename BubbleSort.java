public class BubbleSort {

	public static void main(String[] args) {

		if(args.length == 0){
			System.out.println("Wrong parameter input");
			return;
		}

		int number[] = new int[25];
		int length = args.length;
		int temp=0;

		for(int i=0; i<length; i++){
			number[i] = Integer.parseInt(args[i]);
		}

		for(int i=0; i<length-1; i++){
			for(int j=0; j<length-i-1; j++){
				if(number[j] > number[j+1]){
					temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}

		for(int i=0; i<length; i++){
			System.out.println(number[i]);
		}
	}
}