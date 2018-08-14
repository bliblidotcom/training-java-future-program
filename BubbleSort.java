public class BubbleSort {
 public static void main(String[] args) {

 	int[] input = new int[6];
 	int jawaban=1;

 	for(int a=0;a<args.length;a++){
 		input[a] = Integer.parseInt(args[a]);
 	}

 	for(int b=0;b<input.length;b++)
 	{
 		for(int c=0;c<input.length;c++)
 		{
 			if(input[b]<input[c])
 			{
 				int temp = input[c];
 				input[c]=input[b];
 				input[b]=temp;
 			}
 		}
 	}

 	for(int a=0;a<input.length;a++)
 		System.out.println(input[a]+ " ");
 }

}

