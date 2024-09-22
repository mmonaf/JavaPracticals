
public class Methodarg  
{
	void m1(Methodarg ma)
	{
		System.out.println("I m in m1 method");
	}
	void m2()
	{
		m1(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodarg ma=new Methodarg();
		ma.m2();
	}
}
