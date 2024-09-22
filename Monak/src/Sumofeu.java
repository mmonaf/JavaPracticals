
public class Sumofeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
        int sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
        int squareOfSum = (int) Math.pow((n * (n + 1)) / 2, 2);
        int difference = squareOfSum - sumOfSquares;

        System.out.println("Difference between the sum of the squares and the square of the sum for the first " + n + " natural numbers is: " + difference);
    }
	}


