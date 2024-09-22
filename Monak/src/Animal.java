class Animal 
{
	public String Color;

	void eat()
	{
		System.out.println("eating");
		
	}
}
class Dog extends Animal
	{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
	}
}
