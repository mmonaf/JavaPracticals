
public class Patterns15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				if(k>1 && k<(i*2)-1)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//
//		}
		for (int i = 1; i <= 5; i++) 
		{
			for (int k = 5; k >=i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j < (i * 2); j++) 
			{
				if(j>1 && j<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();

		}
	}
}