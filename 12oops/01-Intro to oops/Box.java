class demo
{
	
		int l = 5;
		int b = 6;
		int h = 5;

		void printVolume()
		{
			int volume = l * b * h;
			System.out.println("Volume of the box is : " + volume);
		}

		int fetchSurfaceArea()
		{
			int surfaceArea = 2 * ( l * b + b * h + l * h);
			System.out.println("Area returned to caller ");
			return surfaceArea;
		}
}

class Box
{
	public static void main(String args[])
	{
		demo b = new demo();
		b.printVolume();
		System.out.println("Volume of the cube is " + b.l * b.h * b.b);
		b.l = 10;
		b.b = 20;
		b.h = 30;
		System.out.println("Volume of the cube is " + b.l * b.h * b.b);
	}
}