package com.evaluation;

import java.util.Arrays;
import java.util.Stack;

public class ExpressionEvaluation {
	
	public static int calculate(int op1, int op2, char opr) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/':
            if (op2 != 0) {
                return op1 / op2;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        case '%':
            if (op2 != 0) {
                return op1 % op2;
            } else {
                throw new ArithmeticException("Modulus by zero");
            }
		case '^': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	//Handled multi-digit numbers using string builder
	public static int postfixEvaluate(String postfixExpression) {
		//Create a stack to push operands
		Stack<Integer> stack = new Stack<>();
		StringBuilder numberString = new StringBuilder();
		
		//traverse post fix expressions from left to right
		for(int i=0; i<postfixExpression.length(); i++) {
			//extract element from i th index
			char element = postfixExpression.charAt(i);
			
			//check if operand - push it on stack
			if(element == ' ') {
				if(numberString.length()!=0) {
					stack.push(Integer.valueOf(numberString.toString()));
					numberString.delete(0, numberString.length());
				}
				else {
					continue;
				}
			}
			else if(Character.isDigit(element)) {
				numberString.append(element);
			}
			else {
				//else pop 2 elements from stack
				//1 will become second operand
				int op2 = stack.pop();
				//2 will become first operand
				int op1 = stack.pop();
				//perform operation of op1 op2 and element
				int result = calculate(op1, op2, element);
				//push result on stack
				stack.push(result);
			}
		}
		//pop result from stack and return it
		if(!stack.isEmpty()) {
			return stack.pop(); 
		}
		return 0;
	}
	
	//Handled multi-digit numbers using String split method
	//Also included print statements to understand operations - Debugged
	
	public static int prefixEvaluate(String prefixExpression) {
		//Create a stack to push operands
		Stack<Integer> stack1 = new Stack<>();
		
		String[] prefixExpressionArray = prefixExpression.split("\\s+");
		
		System.out.println("prefixExpressionArray = " + Arrays.toString(prefixExpressionArray));
		
		//traverse post fix expressions from right to left
		for(int i=prefixExpressionArray.length -1; i>=0; i--) {
			//extract element from i th index
			String element = prefixExpressionArray[i];
			System.out.println("Processing element: " + element);
			
			//check if operand - push it on stack
			if(Character.isDigit(element.charAt(0))) {
				int operand = Integer.valueOf(element);
				stack1.push(operand);	
				
				System.out.println("Pushing operand onto stack: " + operand);
			}
	        //else pop 2 elements from stack
			else {
				//1 will become first operand
				int op1 = stack1.pop();
				//2 will become second operand
				int op2 = stack1.pop();
				
				System.out.println("Popped operands: " + op1 + ", " + op2);
				
				//perform operation of op1 op2 and operator
				int result = calculate(op1, op2, element.charAt(0));
				
				System.out.println("Result pushed: " + result);
				
				//push result on stack
				stack1.push(result);
			}
		}
		//pop result from stack and return it
		if(!stack1.isEmpty()) {
			return stack1.pop(); 
		}
		return 0;
	}

	public static void main(String[] args) {
		
		String postfix = "23 45 + 67 * 89 -";
		
		System.out.println("PostfixExp : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "+ − * 23 45 * 67 / / 89 9 3 2 + 320 * 8 4";
		
		System.out.println("PrefixExp : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);
	}

}
