public class BubbleSort{
	public static void main(String[] args){
		
	int total= args.length;
	int angka[],temp;
	angka= new int[100];
		
	for(int i=0;i<total;i++){
		angka[i]= Integer.parseInt(args[i]);
	}
		
	for(int i=0;i<total;i++){
		for(int j=0; j<total-i-1;j++){
			if(angka[j]>angka[j+1]){
				 temp = angka[j];
                 angka[j] = angka[j+1];
                 angka[j+1] = temp;
			}
		}
	}
		
	for(int i=0;i<total;i++){
		System.out.println(angka[i]);
	}	
		
  }
}


//kecil ke besar