//verifying default value
class ArraysDemoTwo
{
	public static void main(String args[])
	{
		int z[]=new int [5];


		System.out.println("value of 1st index is " + z[0]);
		System.out.println("value of 2nd index is " + z[1]);
		System.out.println("value of 3rd index is " + z[3]);
		System.out.println("value of 4th index is " + z[4]);
		//System.out.println("value of 5th index is " + z[5]);
		//for float
		float y[]=new float[2];
		System.out.println("value of 1st index is " + y[0]);
		//for long
		long t[]=new long[2];
		System.out.println("value of long is " + t[0]);
		//for double 
		double e[]=new double[2];
		System.out.println("value of  double is " + e[1]);
		//for byte 
		byte q[]=new byte[2];
		System.out.println("value of byte is " + q[0]);
		//for short
		short s[]=new short[2];
		System.out.println("value of short is " + s[0]);
		//for boolean
		boolean b[]=new boolean[2];
		System.out.println("value of boolean is " + b[1]);
	}
}