class BubbleSort{

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage BubbleSort <arg1, ..., ...>");
        
            return;
        }
    
        int arr[] = new int[args.length];

        for(int i = 0; i < args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}