//enhanced for loop addition program
class loopsDemoFive
{
	public static void main(String args[])
	{
		int sum=0;
		int z[] = {10,20,30,40,50};

		for(int a :z)
		{
			int c = a + sum; 
			System.out.println(a + sum);
			sum = sum + a;
		}
	}
}