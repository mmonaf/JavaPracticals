
public class Prime1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeIndex = 10001;
        int prime = findNthPrime(primeIndex);
        System.out.println("The " + primeIndex + "st prime number is: " + prime);
    }

    public static int findNthPrime(int n) {
        if (n == 1) {
            return 2; // The first prime number is 2
        }

        int count = 1; // Already counting 2
        int number = 1; // Start from 3
        while (count < n) {
            number += 2; // Move to the next odd number
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    
	}

}
