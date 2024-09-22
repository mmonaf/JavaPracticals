
public class Animal3 {

	 void eat() 
	 {
		System.out.println("Eating");
	 }
}
class Cat extends Animal3 {

		public static void main(String[] args) 
		{
			Cat c = new Cat();
			c.eat();
		}
	}
