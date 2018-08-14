public class Factorial {
    private static Integer fact (Integer input) {
        Integer temp = 1;
        for (int i = 1; i <= input; i++) {
            temp *= i;
        }
        return temp;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error Input!");
        }
        else {
            System.out.println(fact(Integer.parseInt(args[0])));
        }
    }
}