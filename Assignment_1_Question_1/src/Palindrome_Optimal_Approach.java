
public class Palindrome_Optimal_Approach {
	
//OPTIMAL -  1. Check half of the String
				//t -> O(n)
				//s -> O(1)
	
//			 2. Using two pointers
				//t -> O(n) 
				//s -> O(1)

public static final String palindromeString = "deified";
public static final String nonPalindromeString = "awesome";

	public static void main(String[] args) {
		
		if(isPalindromeCheckHalf(palindromeString)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
		
		if(isPalindromeTwoPointers(nonPalindromeString)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}

	}
	
	//Check half of the String
	public static boolean isPalindromeCheckHalf(String s) {
	    int length = s.length();

	    for (int i = 0; i < length / 2; i++) {
	        if (s.charAt(i) != s.charAt(length - 1 - i)) {
	            return false;
	        }
	    }

	    return true;
	}

	//Using two pointers
	public static boolean isPalindromeTwoPointers(String s) {
	    int start = 0;
	    int end = s.length() - 1;

	    while (start < end) {

	        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
	            return false;
	        }

	        start++;
	        end--;
	    }

	    return true;
	}

}
