class Add
{
	void add()
	{
		int x,y=30,z=10;
		x=y+z;
		System.out.print("Add:"+x);
	}
}

class Sub extends Add
{
	void sub()
	{
		int x,y=30,z=10;
		x=y-z;
		System.out.print("Sub:"+x);
	}
}
class Inheritence
{
	public static void main(String[] args)
	{
		Sub obj = new Sub();
		obj.sub();
		obj.add();
	}
}