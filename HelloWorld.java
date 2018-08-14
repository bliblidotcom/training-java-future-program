public class HelloWorld {

    public static void main(String[] args) {
    	int score = Integer.parseInt(args[0]);
    	char grade;

        if (score > 80){
			grade = 'A';	
        } else if (score > 60) {
			grade = 'B';	
        } else if (score > 40) {
			grade = 'C';	
        } else if (score > 20) {
			grade = 'D';	
        } else {
			grade = 'E';	
        }

        System.out.println(grade);

    }
}