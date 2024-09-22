
public class primeeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 600851475143L;
        long largestPrimeFactor = 1;

        for (long i = 2; i <= number; i++) {
            if (number % i == 0) {
                largestPrimeFactor = i;
                number = number / i;
                i--;
            }
        }

        System.out.println("The largest prime factor of 600851475143 is: " + largestPrimeFactor);
	}

}
