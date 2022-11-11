package palindrome;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int reversedNum = 0  , remainder ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a even number to find whether it is palindrome or not : ");
		int num = sc.nextInt();
		
		int originalNum = num;
		
		while(num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /=10;
		}
		
		if(originalNum == reversedNum) {
			System.out.println("Entered " + originalNum + " is palindrome");
		} else {
			System.out.println("Entered " + originalNum + " is not palindrome");
		}
		
		
	}

}
