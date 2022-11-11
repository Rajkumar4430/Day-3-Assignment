package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator : +, -, *, /, % ");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter first number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number :");
		double num2 = sc.nextDouble();
		
		
		switch(operator) {
		case '+' :
			result = num1 + num2 ;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
			
		case '-' :
			result = num1 - num2 ;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;		
			
		case '*' :
			result = num1 * num2 ;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
			
		case '/' :
			result = num1 / num2 ;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
			
		case '%' :
			result = num1 % num2 ;
			System.out.println(num1 + " % " + num2 + " = " + result);
			break;
			
		default :
			System.out.println("Invalid operator");
			break;
		}
		
		
		
	}


}
