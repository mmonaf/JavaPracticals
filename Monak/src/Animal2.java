
public class Animal2 {
 String color;
 int age;
 void initObj(String c,int a)
 {
	 color=c;
	 age=a;
 }
 void display()
 {
	 System.out.println(color+" "+age);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal2 a=new Animal2();
a.initObj("Black",10);
a.display();


	}

}
