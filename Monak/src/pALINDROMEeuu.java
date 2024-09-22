
public class pALINDROMEeuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int largestPalindrome = 0;

	        for (int i = 100; i < 1000; i++) {
	            for (int j = 100; j < 1000; j++) {
	                int product = i * j;
	                if (isPalindrome(product) && product > largestPalindrome) {
	                    largestPalindrome = product;
	                }
	            }
	        }

	        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
	    }

	    public static boolean isPalindrome(int number) {
	        String numString = String.valueOf(number);
	        int left = 0;
	        int right = numString.length() - 1;

	        while (left < right) {
	            if (numString.charAt(left) != numString.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
	}
