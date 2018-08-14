public class IterationFor {
 public static void main(String[] args) {

 	int input=Integer.parseInt(args[0]);
 	int jawaban=1;

 	for(int i=input;i>1;i--){
 		jawaban=jawaban*i;
 	}
 	System.out.println(jawaban);
}
}

