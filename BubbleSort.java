public class BubbleSort {
    private static Integer[] sort(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[i] > input[j]) {
                    Integer temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid input");
        }
        else {
            Integer[] input = new Integer[args.length];
            for (int i = 0; i < args.length; i++) {
                input[i] = Integer.parseInt(args[i]);
            }
            input = sort(input);
            for (Integer el : input) {
                System.out.print(el + " ");
            }
            System.out.println();
        } 
    }
}