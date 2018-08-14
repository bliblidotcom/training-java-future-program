public class FactRecursive {
    private static int fact(int input) {
        if (input == 0 || input == 1) {
            return 1;
        }
        else {
            return input*fact(input-1);
        }
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