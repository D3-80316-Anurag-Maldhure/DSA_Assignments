import java.util.Stack;

public class Palindrome_Better_Approach {

	//BETTER -  1. Convert to Array and Compare
					//t -> O(n)
					//s -> O(n) (if the array is considered)
	
	//			2. Using recursion
					//t -> O(n) 
					//s -> O(n) (considering the recursion stack)
	
	//			3. Using a stack
					//t -> O(n) 
					//s -> O(n) (considering the recursion stack)
	
	public static final String palindromeString = "deified";
	public static final String nonPalindromeString = "awesome";
				
	public static void main(String[] args) {

		if(isPalindromeArrayComparison(palindromeString)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
		
		if(isPalindromeRecursive(nonPalindromeString)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
		
		if(isPalindromeUsingStack(palindromeString)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
	}
	
//	ITERATIVE APPROACH
	
	public static boolean isPalindromeArrayComparison(String s) {
	    char[] charArray = s.toCharArray();
	    int start = 0;
	    int end = charArray.length - 1;

	    while (start < end) {
	        if (charArray[start] != charArray[end]) {
	            return false;
	        }
	        start++;
	        end--;
	    }

	    return true;
	}



//	RECURSIVE APPROACH
	
	public static boolean isPalindromeRecursive(String s) {
	    if (s.length() <= 1) {
	        return true;
	    }

	    char first = s.charAt(0);
	    char last = s.charAt(s.length() - 1);

	    if (first == last) {
	        return isPalindromeRecursive(s.substring(1, s.length() - 1));
	    } else {
	        return false;
	    }
	}
	
//	USING A STACK
	
	public static boolean isPalindromeUsingStack(String s) {
	    int length = s.length();
	    Stack<Character> stack = new Stack<>();

	    for (int i = 0; i < length / 2; i++) {
	        stack.push(s.charAt(i));
	    }

	    int start = (length + 1) / 2;

	    while (!stack.isEmpty()) {
	        char top = stack.pop();
	        if (top != s.charAt(start)) {
	            return false;
	        }
	        start++;
	    }

	    return true;
	}

}
