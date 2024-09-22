//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2
//-digit numbers is 9009=91*99
//.Find the largest palindrome made from the product of two 3-digit numbers.




public class Palindromeeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class PalindromeExample{  
			 public static void main(String args[]){  
			  int r,sum=0,temp;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			}  
			
	}

}
