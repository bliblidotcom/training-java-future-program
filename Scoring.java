import java.util.Scanner;

class Scoring{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int score = sc.nextInt();
        if(args.length < 1){
            System.out.println("Usage Scoring <score>");

            return;
        }

        int score = Integer.parseInt(args[0]);

        if(score >= 80 && score <= 100){
            System.out.println("A");
        }else if(score >= 60 && score < 80){
            System.out.println("B");
        }else if(score >= 40 && score < 60){
            System.out.println("C");
        }else if(score >= 20 && score < 40){
            System.out.println("D");
        }else if(score >= 0 && score < 20){
            System.out.println("E");
        }
    }
}