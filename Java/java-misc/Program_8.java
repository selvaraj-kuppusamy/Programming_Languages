class box
{
	int width;
	int height;
	int length;
}
class Program_8
{
 	public static void main(String... args)
	{
		box obj = new box();
		obj.width=10;
		obj.height=2;
		obj.length=10;
		int y=obj.width*obj.height*obj.length;
		System.out.println(y);
	}
}
