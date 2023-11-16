public class Palindrome_BFA {
	
	//BRUTE FORCE APPROACH
	
	//t -> O(n^2) (due to string concatenation)
	//s -> O(n) (for the reversed string)
	
	public static final String palindromeString = "deified";
	public static final String nonPalindromeString = "awesome";

	public static void main(String[] args) {
		
		String reversed = new StringBuilder(palindromeString).reverse().toString();
		
		if(palindromeString.equals(reversed)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
	}
}





