package com.priority;

import java.util.Scanner;

public class Priority {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}
	

	public static void main(String[] args) {
	
		System.out.println("Enter a operator whose priority you want ($, /, *, %, +, -):");
		Scanner scanner = new Scanner(System.in);
		char operator = scanner.next().charAt(0);
		System.out.println("Priority of "+operator+" = "+priority(operator));
		scanner.close();
	}

}
