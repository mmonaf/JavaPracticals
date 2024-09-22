
public class Superkeyword 
{
	int i=10;
}
class Super extends Superkeyword
{
	int i=20;
	void show(int i)
	{
		System.out.println(super.i);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Super ob =new Super();
		ob.show(30);
	}
}
