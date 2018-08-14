public class BubbleSort {
	public BubbleSort(Integer count, Integer[] passedArray){
		for(int i = 0; i < count; i++){
			for(int j = 0; j < i; j++){
				if(passedArray[i] <= passedArray[j]){
					//Perform swap
					passedArray[i] = passedArray[i] * passedArray[j];
			        passedArray[j] = passedArray[i] / passedArray[j];
        			passedArray[i] = passedArray[i] / passedArray[j];
				}
			}
		}

		for(int i = 0; i < count; i++){
			System.out.println(passedArray[i]);
		}
	}

	public static void main(String[] args){
		Integer numberOfItems = args.length;
		Integer[] inputsToBeSorted = new Integer[numberOfItems];

		for(int i = 0; i < numberOfItems; i++){
			inputsToBeSorted[i] = Integer.parseInt(args[i]);
		}

		try {
			new BubbleSort(numberOfItems, inputsToBeSorted);
		} catch (Exception e) {
			System.out.println("Empty argument!");
		}
	}
}