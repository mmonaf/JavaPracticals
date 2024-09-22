
public class Fibonaciis {

	
		 public static void main(String[] args) {
		        int sum = 0;
		        int previous = 1;
		        int current= 2;
		        while (current <= 4000000) 
		        {
		            if (current % 2 == 0) 
		            {
		                sum += current;
		            }
		            int next = previous + current;
		            previous = current;
		            current = next;
		        }
		        System.out.println("Sum of even-valued terms in the Fibonacci sequence below four million: " + sum);
		    }
		}
	
