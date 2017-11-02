package edu.wit.cs.comp1000;
import java.util.Scanner;
public class LA4a {
	
	/**
	 * Error to output if either input is not positive
	 */
	static final String E_POSITIVE = "Inputs must both be positive.";

	public static void main(String[] args) {
		int a, b, ans;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a: ");
		a = input.nextInt();
		System.out.printf("Enter b: ");
		b = input.nextInt();
		if ((a <= 0)||(b <= 0)) {
			System.out.printf("Inputs must both be positive.%n");}
		else {
			ans = gcd(a, b);
			System.out.printf("The GCD of %d and %d is %d%n", a, b, ans);
		}
	}
	
	/**
	 * Returns the greatest common denominator (gcd) of two positive integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	public static int gcd(int num1, int num2) {
		int a,b,q,r;
		if (num2 == 0) {return num1;}
		else {
			a = num1;
			b = num2;
			do {
				r = a % b;
				q = a / b;
				a = b;
				b = r;
			}while (r != 0);
			return a;
		}
	}

}
