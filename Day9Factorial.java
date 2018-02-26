import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9Factorial {

	static int factorial(int n) {
		// Complete this function
		int result;

		if (n == 1) // base case
			return 1;

		result = n * factorial(n - 1);

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		System.out.println(result);
	}
}
