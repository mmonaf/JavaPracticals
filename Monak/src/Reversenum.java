
public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem;int rev=0;
		int n=9087;
while(n!=0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
System.out.println(rev);
	}

}
