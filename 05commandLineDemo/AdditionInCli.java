class AdditionInCli
{
	public static void main(String args[])
	{
		String a = args[0];
		String b = args[1];

		int p = Integer.parseInt(a);
		int q = Integer.parseInt(b);

		int c = p + q;
		System.out.println(c);
	}
}