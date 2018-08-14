public class faktorial
{
	public static void main(String[] args)
	{
		int value = Integer.parseInt(args[0]);
		int i =1;
		int res=1;
		for(i=1;i<=value;i++)
		{
			res *= i;
		}
		System.out.println(res);
	}
}