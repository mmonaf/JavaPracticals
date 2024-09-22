
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int rev=0,rem,temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n+ "number is palindrome");
		}
		else
		{
			System.out.println(n+ "number is not palindrome");

		}
	}
		
}
