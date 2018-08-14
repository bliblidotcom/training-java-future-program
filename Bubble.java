//import java.util.Scanner;

public class Bubble {

	public static void main(String[] args){

		int[] arr = new int[10];
		int tmp = 0;
		for (int i=0; i<args.length; i++){
			arr[i] = Integer.parseInt(args[i]);
		};

		for (int i=0; i<args.length-1; i++){
			for (int j=i+1; j<args.length; j++){
				if (arr[i]>arr[j]){
					tmp    = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				};
			};			
		};

		for (int i=0; i<args.length; i++){
			System.out.print(arr[i]+" ");
		};

	}
}