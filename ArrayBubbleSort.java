public class ArrayBubbleSort {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.err.println("Array of Number to be sorted");
			return;
		}

		//https://en.wikipedia.org/wiki/Bubble_sort

		// int[] arrayBubble -> Mendeklarasi variabel array
		// arrayBubble = new int[10] -> Menginstansiasi object array
		int[] arrayBubble = new int[args.length+1];
		for (int i = 0; i < args.length; i++) {
			arrayBubble[i] = Integer.parseInt(args[i]);
		}

		//boolean swapped = false;
		int swapped;
		do {
			swapped = 0;
			for (int i = 0; i < arrayBubble.length - 1; i++) {
				if (arrayBubble[i] > arrayBubble[i+1] ) {
					// sort tanpa temp -> pakai XOR
					int temp = arrayBubble[i];
					arrayBubble[i] = arrayBubble[i+1];
					arrayBubble[i+1] = temp;
					swapped ++;
				}
			}

		} while (swapped != 0);

		for (int i = 1; i < arrayBubble.length; i++) {
			System.out.println(arrayBubble[i] + " ");
		}
	}
}