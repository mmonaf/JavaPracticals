
public class Keyword 
{
	int i;
	void setValue(int x)
	{
		this.i=x;
	}
	void show()
	{
		System.out.println(i);
	}
}
class Keyword2 extends Keyword
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			Keyword k=new Keyword();
			k.setValue(10);
			k.show();
	}
}
	