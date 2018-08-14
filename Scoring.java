public class Scoring {
    public static void main(String[] args) {
        Integer score = null;
        if (args.length > 0) {
            score = Integer.parseInt(args[0]);
        }
        if (score > 80) {
            System.out.println("A");
        }
        else if (score > 50) {
            System.out.println("B");
        }
        else {
            System.out.println("E");
        }
    }
}