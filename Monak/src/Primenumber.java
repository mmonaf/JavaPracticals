
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = 1; n <= 100; n++) {
			int temp = 0;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					temp = temp + 1;
				}
			}

			if (temp == 0) {
				System.out.println(n);
			}

		}
	}
}
