public class LetterGrade{
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: LetterGrade <numeric-sscore>");
            return;
        }
        int score = Integer.parseInt(args[0]);
        if(score <20){
            System.out.println("Nilai anda E");
        }
        else if(score <40){
            System.out.println("Nilai anda D");
        }
        else if(score <60){
            System.out.println("Nilai anda C");
        }
        else if(score <80){
            System.out.println("Nilai anda B");
        }
        else{
            System.out.println("Nilai anda A");
        }
    }
}