public class sort{
	public static void main(String[] args)
	{
		int len = args.length;
		int[] arr;
		arr = new int[len];
		for(int i=0; i<len;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<len;i++)
		{
			int temp = 0;
			for(int j=0;j<len;j++)
			{
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i=0; i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}