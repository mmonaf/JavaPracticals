
public class MaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]a= {4,8,9,5,7};
//	int max=a[0];
//	for(int i=1;i<a.length;i++)
//	{
//		if(max<a[i])
//		{
//			max=a[i];
//		}
//	}
//System.out.println("Maximum Number is "+max);
//	}
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
	}
System.out.println("Minimum Number is "+min);
	}

}
