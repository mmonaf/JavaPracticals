
public class ArrayD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{10,20,30},{40,50,60}};
		for(int i=0;i<a.length;i++)
		{
			a[0][1]=10;
			a[1][2]=20;
			a[2][3]=30;
			System.out.println(a[i]+" ");
		}
//		for(int i:a)
//		{
//			System.out.println(i+" ");
//		}
	}
}