
public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;int b=1;
System.out.println(a+""+b);
int c;
for(int i=1;i<=10;i++)
{
	 c=a+b;
	 System.out.println(""+c);
	 a=b;
	 b=c;
}
	}

}
