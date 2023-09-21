class ControlStstementsDemoThree
{
	public static void main(String args[])
	{
		String a = args[0];
		String b = args[1];

		int p = Integer.parseInt(a);
		int q = Integer.parseInt(b);

		if(p % q == 0)
		{
			System.out.println("p is even number ");
		}
		else
		{
			System.out.println(" p is odd number ");
		}
	}
}