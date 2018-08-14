public class Sort{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Usage: java Sort <array of int>");
        }

        int[] numbers = new int[args.length];

        for(int i=0; i<args.length; i++){
            numbers[i] =  Integer.parseInt(args[i]);
        }

        Sort sort = new Sort();

        sort.bubble(numbers);

        for(int number : numbers){
            System.out.print(number + " ");
        }
    }

    public void bubble(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            
    }
}