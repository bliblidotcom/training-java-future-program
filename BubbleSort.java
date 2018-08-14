
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length == 0) {
			System.out.println("Usage: LetterGrade <numeric-score>");
			return;
		}
		int data[] = new int[args.length];
		int tamp = 0;

		for(int i=0;i<data.length;i++){
			data[i] = Integer.parseInt(args[i]);
		}

		for(int i=0;i<data.length;i++){
			for(int j=0;j<data.length;j++){
				if(data[i] < data[j]){
					tamp = data[i];
					data[i] = data[j];
					data [j] = tamp;	
				}
			}
		}

		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
        
	}
}
