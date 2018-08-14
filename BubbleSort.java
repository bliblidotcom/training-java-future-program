public class BubbleSort{
	public static void main(String[] args){
            int numberArray[] = new int[args.length];
            for(int i=0; i<args.length;i++){
                numberArray[i] = Integer.parseInt(args[i]);
            }

            for(int i=0; i<numberArray.length; i++){
                for(int j=0;j<numberArray.length;j++){
                    if(numberArray[i]<numberArray[j]){
                        numberArray[i] = numberArray[i]*numberArray[j];
                        numberArray[j] = numberArray[i]/numberArray[j];
                        numberArray[i] = numberArray[i]/numberArray[j];
                    }
                }
            }

            for(int i=0; i<numberArray.length; i++){
                System.out.println(numberArray[i]);
            }
	}
}
