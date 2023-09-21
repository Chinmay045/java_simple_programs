class ArraysDemoFive
{
	public static void main(String args[])
	{
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=false;
		b[2]=true;
		for(int i=0;i<b.length;i++)
		{
				System.out.println("value of boolaen index [" + i + "] is " + b[i]);
		
		}

		double d[]={43,45,45.5,38};
		for(int i=0;i<d.length;i++)
		{
				System.out.println("value of double of index [" + i + "] is " + d[i]);
		
		}

	}

}