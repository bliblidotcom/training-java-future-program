import java.util.*;

public class BubbleSort
{
	public static void main(String args[])
	{
		if (args.length == 0){
			System.out.println("Usage Factorial <numeric-number>");
			return;
		}
		int data[] = new int[args.length];
		int i, j;

		//Fill Data
		for(i=0;i<args.length;i++){
			data[i] = Integer.parseInt(args[i]);
		}

		//Bubble Sort
		int temp;
		for(i=0;i<data.length-1;i++){
			for(j=i+1;j<data.length;j++){
				if (data[i] > data[j]){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		//FastWay
		//Arrays.sort(data);
		
		//Print Out
		System.out.println("Sorted Data:");
		for (i=0;i<data.length;i++){			
			if (i != 0) System.out.print(" ");
			System.out.print(data[i]);
		}
	}
}
