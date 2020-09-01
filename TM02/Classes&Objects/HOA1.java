
class Box
{
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int getVolume()
	{
		return width*height*depth;
	}
	
}

class HOA1
{
	public static void main(String[] args)
	{
		Box b = new Box(2,4,6);
		System.out.println(b.getVolume());
		
	}
}