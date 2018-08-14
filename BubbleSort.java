public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for(int a = 0; a < args.length; a++) {
            numbers[a] = Integer.parseInt(args[a]);
        }

        bubbleSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int i,j;
        for (i = 0; i < n-1; i++) {         
            for (j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}