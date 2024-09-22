import java.util.Scanner;

public class Calculatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Select symbol(+,-,/,*)");
		String sym = sc.next();
		int res;
		switch (sym) {
		case "+":res = a + b;
			System.out.println("Addition is:" + res);
			break;
		case "-":res = a - b;
			System.out.println("Substration is:" + res);

			break;
		case "/":res = a / b;
			System.out.println("Division is:" + res);

			break;
		case "*":res = a * b;
			System.out.println("Multiplication is:" + res);

			break;
default:System.out.println("Invalid symbol");
break;
		}
	}

}
