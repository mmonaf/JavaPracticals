import java.util.Scanner;

public class Numcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		System.out.println("Enter count of numbers:");
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		int number,sum=0;
		for(int i=0;i<count;i++)
		{
			number=sc.nextInt();
			sum=sum+number;
		}
		
			System.out.println("sumof numbersis:"+sum);
		}
	}


