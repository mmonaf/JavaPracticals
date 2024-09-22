
public class Stringreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="Mona";
int leng=name.length();
String rev=" ";
for(int i=leng-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
}
System.out.println("Reverse of "+name+"is"+rev);

	}

}
