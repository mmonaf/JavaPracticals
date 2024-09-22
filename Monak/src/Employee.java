
public class Employee 
{
	String name;
	int id;
	void Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			Employee e=new Employee();
			System.out.println("Employee:"+e.name+" "+e.id);
	}

}
